package com.gleo.plugins.hexiagon.service.persistence;

import com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException;
import com.gleo.plugins.hexiagon.model.AnnouncementImage;
import com.gleo.plugins.hexiagon.model.impl.AnnouncementImageImpl;
import com.gleo.plugins.hexiagon.model.impl.AnnouncementImageModelImpl;
import com.gleo.plugins.hexiagon.service.persistence.AnnouncementImagePersistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the announcement image service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author guillaumelenoir
 * @see AnnouncementImagePersistence
 * @see AnnouncementImageUtil
 * @generated
 */
public class AnnouncementImagePersistenceImpl extends BasePersistenceImpl<AnnouncementImage>
    implements AnnouncementImagePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link AnnouncementImageUtil} to access the announcement image persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = AnnouncementImageImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AnnouncementImageModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementImageModelImpl.FINDER_CACHE_ENABLED,
            AnnouncementImageImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AnnouncementImageModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementImageModelImpl.FINDER_CACHE_ENABLED,
            AnnouncementImageImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AnnouncementImageModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementImageModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_A = new FinderPath(AnnouncementImageModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementImageModelImpl.FINDER_CACHE_ENABLED,
            AnnouncementImageImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_A",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_A = new FinderPath(AnnouncementImageModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementImageModelImpl.FINDER_CACHE_ENABLED,
            AnnouncementImageImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_A",
            new String[] { Long.class.getName() },
            AnnouncementImageModelImpl.ANNOUNCEMENTID_COLUMN_BITMASK |
            AnnouncementImageModelImpl.ORDER_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_A = new FinderPath(AnnouncementImageModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementImageModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_A",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_G_A_ANNOUNCEMENTID_2 = "announcementImage.announcementId = ?";
    public static final FinderPath FINDER_PATH_FETCH_BY_A_O = new FinderPath(AnnouncementImageModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementImageModelImpl.FINDER_CACHE_ENABLED,
            AnnouncementImageImpl.class, FINDER_CLASS_NAME_ENTITY,
            "fetchByA_O",
            new String[] { Long.class.getName(), Integer.class.getName() },
            AnnouncementImageModelImpl.ANNOUNCEMENTID_COLUMN_BITMASK |
            AnnouncementImageModelImpl.ORDER_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_A_O = new FinderPath(AnnouncementImageModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementImageModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByA_O",
            new String[] { Long.class.getName(), Integer.class.getName() });
    private static final String _FINDER_COLUMN_A_O_ANNOUNCEMENTID_2 = "announcementImage.announcementId = ? AND ";
    private static final String _FINDER_COLUMN_A_O_ORDER_2 = "announcementImage.order = ?";
    private static final String _SQL_SELECT_ANNOUNCEMENTIMAGE = "SELECT announcementImage FROM AnnouncementImage announcementImage";
    private static final String _SQL_SELECT_ANNOUNCEMENTIMAGE_WHERE = "SELECT announcementImage FROM AnnouncementImage announcementImage WHERE ";
    private static final String _SQL_COUNT_ANNOUNCEMENTIMAGE = "SELECT COUNT(announcementImage) FROM AnnouncementImage announcementImage";
    private static final String _SQL_COUNT_ANNOUNCEMENTIMAGE_WHERE = "SELECT COUNT(announcementImage) FROM AnnouncementImage announcementImage WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "announcementImage.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AnnouncementImage exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AnnouncementImage exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(AnnouncementImagePersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "order"
            });
    private static AnnouncementImage _nullAnnouncementImage = new AnnouncementImageImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<AnnouncementImage> toCacheModel() {
                return _nullAnnouncementImageCacheModel;
            }
        };

    private static CacheModel<AnnouncementImage> _nullAnnouncementImageCacheModel =
        new CacheModel<AnnouncementImage>() {
            @Override
            public AnnouncementImage toEntityModel() {
                return _nullAnnouncementImage;
            }
        };

    public AnnouncementImagePersistenceImpl() {
        setModelClass(AnnouncementImage.class);
    }

    /**
     * Returns all the announcement images where announcementId = &#63;.
     *
     * @param announcementId the announcement ID
     * @return the matching announcement images
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AnnouncementImage> findByG_A(long announcementId)
        throws SystemException {
        return findByG_A(announcementId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the announcement images where announcementId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param announcementId the announcement ID
     * @param start the lower bound of the range of announcement images
     * @param end the upper bound of the range of announcement images (not inclusive)
     * @return the range of matching announcement images
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AnnouncementImage> findByG_A(long announcementId, int start,
        int end) throws SystemException {
        return findByG_A(announcementId, start, end, null);
    }

    /**
     * Returns an ordered range of all the announcement images where announcementId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param announcementId the announcement ID
     * @param start the lower bound of the range of announcement images
     * @param end the upper bound of the range of announcement images (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching announcement images
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AnnouncementImage> findByG_A(long announcementId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_A;
            finderArgs = new Object[] { announcementId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_A;
            finderArgs = new Object[] {
                    announcementId,
                    
                    start, end, orderByComparator
                };
        }

        List<AnnouncementImage> list = (List<AnnouncementImage>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (AnnouncementImage announcementImage : list) {
                if ((announcementId != announcementImage.getAnnouncementId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_ANNOUNCEMENTIMAGE_WHERE);

            query.append(_FINDER_COLUMN_G_A_ANNOUNCEMENTID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(AnnouncementImageModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(announcementId);

                if (!pagination) {
                    list = (List<AnnouncementImage>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<AnnouncementImage>(list);
                } else {
                    list = (List<AnnouncementImage>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first announcement image in the ordered set where announcementId = &#63;.
     *
     * @param announcementId the announcement ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching announcement image
     * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException if a matching announcement image could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AnnouncementImage findByG_A_First(long announcementId,
        OrderByComparator orderByComparator)
        throws NoSuchAnnouncementImageException, SystemException {
        AnnouncementImage announcementImage = fetchByG_A_First(announcementId,
                orderByComparator);

        if (announcementImage != null) {
            return announcementImage;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("announcementId=");
        msg.append(announcementId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAnnouncementImageException(msg.toString());
    }

    /**
     * Returns the first announcement image in the ordered set where announcementId = &#63;.
     *
     * @param announcementId the announcement ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching announcement image, or <code>null</code> if a matching announcement image could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AnnouncementImage fetchByG_A_First(long announcementId,
        OrderByComparator orderByComparator) throws SystemException {
        List<AnnouncementImage> list = findByG_A(announcementId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last announcement image in the ordered set where announcementId = &#63;.
     *
     * @param announcementId the announcement ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching announcement image
     * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException if a matching announcement image could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AnnouncementImage findByG_A_Last(long announcementId,
        OrderByComparator orderByComparator)
        throws NoSuchAnnouncementImageException, SystemException {
        AnnouncementImage announcementImage = fetchByG_A_Last(announcementId,
                orderByComparator);

        if (announcementImage != null) {
            return announcementImage;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("announcementId=");
        msg.append(announcementId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAnnouncementImageException(msg.toString());
    }

    /**
     * Returns the last announcement image in the ordered set where announcementId = &#63;.
     *
     * @param announcementId the announcement ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching announcement image, or <code>null</code> if a matching announcement image could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AnnouncementImage fetchByG_A_Last(long announcementId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_A(announcementId);

        if (count == 0) {
            return null;
        }

        List<AnnouncementImage> list = findByG_A(announcementId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the announcement images before and after the current announcement image in the ordered set where announcementId = &#63;.
     *
     * @param announcementImageId the primary key of the current announcement image
     * @param announcementId the announcement ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next announcement image
     * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException if a announcement image with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AnnouncementImage[] findByG_A_PrevAndNext(long announcementImageId,
        long announcementId, OrderByComparator orderByComparator)
        throws NoSuchAnnouncementImageException, SystemException {
        AnnouncementImage announcementImage = findByPrimaryKey(announcementImageId);

        Session session = null;

        try {
            session = openSession();

            AnnouncementImage[] array = new AnnouncementImageImpl[3];

            array[0] = getByG_A_PrevAndNext(session, announcementImage,
                    announcementId, orderByComparator, true);

            array[1] = announcementImage;

            array[2] = getByG_A_PrevAndNext(session, announcementImage,
                    announcementId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected AnnouncementImage getByG_A_PrevAndNext(Session session,
        AnnouncementImage announcementImage, long announcementId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ANNOUNCEMENTIMAGE_WHERE);

        query.append(_FINDER_COLUMN_G_A_ANNOUNCEMENTID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(AnnouncementImageModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(announcementId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(announcementImage);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<AnnouncementImage> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the announcement images where announcementId = &#63; from the database.
     *
     * @param announcementId the announcement ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByG_A(long announcementId) throws SystemException {
        for (AnnouncementImage announcementImage : findByG_A(announcementId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(announcementImage);
        }
    }

    /**
     * Returns the number of announcement images where announcementId = &#63;.
     *
     * @param announcementId the announcement ID
     * @return the number of matching announcement images
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByG_A(long announcementId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_G_A;

        Object[] finderArgs = new Object[] { announcementId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ANNOUNCEMENTIMAGE_WHERE);

            query.append(_FINDER_COLUMN_G_A_ANNOUNCEMENTID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(announcementId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the announcement image where announcementId = &#63; and order = &#63; or throws a {@link com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException} if it could not be found.
     *
     * @param announcementId the announcement ID
     * @param order the order
     * @return the matching announcement image
     * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException if a matching announcement image could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AnnouncementImage findByA_O(long announcementId, int order)
        throws NoSuchAnnouncementImageException, SystemException {
        AnnouncementImage announcementImage = fetchByA_O(announcementId, order);

        if (announcementImage == null) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("announcementId=");
            msg.append(announcementId);

            msg.append(", order=");
            msg.append(order);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchAnnouncementImageException(msg.toString());
        }

        return announcementImage;
    }

    /**
     * Returns the announcement image where announcementId = &#63; and order = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param announcementId the announcement ID
     * @param order the order
     * @return the matching announcement image, or <code>null</code> if a matching announcement image could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AnnouncementImage fetchByA_O(long announcementId, int order)
        throws SystemException {
        return fetchByA_O(announcementId, order, true);
    }

    /**
     * Returns the announcement image where announcementId = &#63; and order = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param announcementId the announcement ID
     * @param order the order
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching announcement image, or <code>null</code> if a matching announcement image could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AnnouncementImage fetchByA_O(long announcementId, int order,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { announcementId, order };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_A_O,
                    finderArgs, this);
        }

        if (result instanceof AnnouncementImage) {
            AnnouncementImage announcementImage = (AnnouncementImage) result;

            if ((announcementId != announcementImage.getAnnouncementId()) ||
                    (order != announcementImage.getOrder())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_ANNOUNCEMENTIMAGE_WHERE);

            query.append(_FINDER_COLUMN_A_O_ANNOUNCEMENTID_2);

            query.append(_FINDER_COLUMN_A_O_ORDER_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(announcementId);

                qPos.add(order);

                List<AnnouncementImage> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_A_O,
                        finderArgs, list);
                } else {
                    if ((list.size() > 1) && _log.isWarnEnabled()) {
                        _log.warn(
                            "AnnouncementImagePersistenceImpl.fetchByA_O(long, int, boolean) with parameters (" +
                            StringUtil.merge(finderArgs) +
                            ") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
                    }

                    AnnouncementImage announcementImage = list.get(0);

                    result = announcementImage;

                    cacheResult(announcementImage);

                    if ((announcementImage.getAnnouncementId() != announcementId) ||
                            (announcementImage.getOrder() != order)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_A_O,
                            finderArgs, announcementImage);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_A_O,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (AnnouncementImage) result;
        }
    }

    /**
     * Removes the announcement image where announcementId = &#63; and order = &#63; from the database.
     *
     * @param announcementId the announcement ID
     * @param order the order
     * @return the announcement image that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AnnouncementImage removeByA_O(long announcementId, int order)
        throws NoSuchAnnouncementImageException, SystemException {
        AnnouncementImage announcementImage = findByA_O(announcementId, order);

        return remove(announcementImage);
    }

    /**
     * Returns the number of announcement images where announcementId = &#63; and order = &#63;.
     *
     * @param announcementId the announcement ID
     * @param order the order
     * @return the number of matching announcement images
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByA_O(long announcementId, int order)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_A_O;

        Object[] finderArgs = new Object[] { announcementId, order };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_ANNOUNCEMENTIMAGE_WHERE);

            query.append(_FINDER_COLUMN_A_O_ANNOUNCEMENTID_2);

            query.append(_FINDER_COLUMN_A_O_ORDER_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(announcementId);

                qPos.add(order);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the announcement image in the entity cache if it is enabled.
     *
     * @param announcementImage the announcement image
     */
    @Override
    public void cacheResult(AnnouncementImage announcementImage) {
        EntityCacheUtil.putResult(AnnouncementImageModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementImageImpl.class, announcementImage.getPrimaryKey(),
            announcementImage);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_A_O,
            new Object[] {
                announcementImage.getAnnouncementId(),
                announcementImage.getOrder()
            }, announcementImage);

        announcementImage.resetOriginalValues();
    }

    /**
     * Caches the announcement images in the entity cache if it is enabled.
     *
     * @param announcementImages the announcement images
     */
    @Override
    public void cacheResult(List<AnnouncementImage> announcementImages) {
        for (AnnouncementImage announcementImage : announcementImages) {
            if (EntityCacheUtil.getResult(
                        AnnouncementImageModelImpl.ENTITY_CACHE_ENABLED,
                        AnnouncementImageImpl.class,
                        announcementImage.getPrimaryKey()) == null) {
                cacheResult(announcementImage);
            } else {
                announcementImage.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all announcement images.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(AnnouncementImageImpl.class.getName());
        }

        EntityCacheUtil.clearCache(AnnouncementImageImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the announcement image.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(AnnouncementImage announcementImage) {
        EntityCacheUtil.removeResult(AnnouncementImageModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementImageImpl.class, announcementImage.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(announcementImage);
    }

    @Override
    public void clearCache(List<AnnouncementImage> announcementImages) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (AnnouncementImage announcementImage : announcementImages) {
            EntityCacheUtil.removeResult(AnnouncementImageModelImpl.ENTITY_CACHE_ENABLED,
                AnnouncementImageImpl.class, announcementImage.getPrimaryKey());

            clearUniqueFindersCache(announcementImage);
        }
    }

    protected void cacheUniqueFindersCache(AnnouncementImage announcementImage) {
        if (announcementImage.isNew()) {
            Object[] args = new Object[] {
                    announcementImage.getAnnouncementId(),
                    announcementImage.getOrder()
                };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_A_O, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_A_O, args,
                announcementImage);
        } else {
            AnnouncementImageModelImpl announcementImageModelImpl = (AnnouncementImageModelImpl) announcementImage;

            if ((announcementImageModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_A_O.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        announcementImage.getAnnouncementId(),
                        announcementImage.getOrder()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_A_O, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_A_O, args,
                    announcementImage);
            }
        }
    }

    protected void clearUniqueFindersCache(AnnouncementImage announcementImage) {
        AnnouncementImageModelImpl announcementImageModelImpl = (AnnouncementImageModelImpl) announcementImage;

        Object[] args = new Object[] {
                announcementImage.getAnnouncementId(),
                announcementImage.getOrder()
            };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_A_O, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_A_O, args);

        if ((announcementImageModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_A_O.getColumnBitmask()) != 0) {
            args = new Object[] {
                    announcementImageModelImpl.getOriginalAnnouncementId(),
                    announcementImageModelImpl.getOriginalOrder()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_A_O, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_A_O, args);
        }
    }

    /**
     * Creates a new announcement image with the primary key. Does not add the announcement image to the database.
     *
     * @param announcementImageId the primary key for the new announcement image
     * @return the new announcement image
     */
    @Override
    public AnnouncementImage create(long announcementImageId) {
        AnnouncementImage announcementImage = new AnnouncementImageImpl();

        announcementImage.setNew(true);
        announcementImage.setPrimaryKey(announcementImageId);

        return announcementImage;
    }

    /**
     * Removes the announcement image with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param announcementImageId the primary key of the announcement image
     * @return the announcement image that was removed
     * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException if a announcement image with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AnnouncementImage remove(long announcementImageId)
        throws NoSuchAnnouncementImageException, SystemException {
        return remove((Serializable) announcementImageId);
    }

    /**
     * Removes the announcement image with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the announcement image
     * @return the announcement image that was removed
     * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException if a announcement image with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AnnouncementImage remove(Serializable primaryKey)
        throws NoSuchAnnouncementImageException, SystemException {
        Session session = null;

        try {
            session = openSession();

            AnnouncementImage announcementImage = (AnnouncementImage) session.get(AnnouncementImageImpl.class,
                    primaryKey);

            if (announcementImage == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchAnnouncementImageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(announcementImage);
        } catch (NoSuchAnnouncementImageException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected AnnouncementImage removeImpl(AnnouncementImage announcementImage)
        throws SystemException {
        announcementImage = toUnwrappedModel(announcementImage);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(announcementImage)) {
                announcementImage = (AnnouncementImage) session.get(AnnouncementImageImpl.class,
                        announcementImage.getPrimaryKeyObj());
            }

            if (announcementImage != null) {
                session.delete(announcementImage);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (announcementImage != null) {
            clearCache(announcementImage);
        }

        return announcementImage;
    }

    @Override
    public AnnouncementImage updateImpl(
        com.gleo.plugins.hexiagon.model.AnnouncementImage announcementImage)
        throws SystemException {
        announcementImage = toUnwrappedModel(announcementImage);

        boolean isNew = announcementImage.isNew();

        AnnouncementImageModelImpl announcementImageModelImpl = (AnnouncementImageModelImpl) announcementImage;

        Session session = null;

        try {
            session = openSession();

            if (announcementImage.isNew()) {
                session.save(announcementImage);

                announcementImage.setNew(false);
            } else {
                session.merge(announcementImage);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !AnnouncementImageModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((announcementImageModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_A.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        announcementImageModelImpl.getOriginalAnnouncementId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_A, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_A,
                    args);

                args = new Object[] {
                        announcementImageModelImpl.getAnnouncementId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_A, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_A,
                    args);
            }
        }

        EntityCacheUtil.putResult(AnnouncementImageModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementImageImpl.class, announcementImage.getPrimaryKey(),
            announcementImage);

        clearUniqueFindersCache(announcementImage);
        cacheUniqueFindersCache(announcementImage);

        return announcementImage;
    }

    protected AnnouncementImage toUnwrappedModel(
        AnnouncementImage announcementImage) {
        if (announcementImage instanceof AnnouncementImageImpl) {
            return announcementImage;
        }

        AnnouncementImageImpl announcementImageImpl = new AnnouncementImageImpl();

        announcementImageImpl.setNew(announcementImage.isNew());
        announcementImageImpl.setPrimaryKey(announcementImage.getPrimaryKey());

        announcementImageImpl.setAnnouncementImageId(announcementImage.getAnnouncementImageId());
        announcementImageImpl.setCompanyId(announcementImage.getCompanyId());
        announcementImageImpl.setGroupId(announcementImage.getGroupId());
        announcementImageImpl.setUserId(announcementImage.getUserId());
        announcementImageImpl.setAnnouncementId(announcementImage.getAnnouncementId());
        announcementImageImpl.setFileEntryId(announcementImage.getFileEntryId());
        announcementImageImpl.setDescription(announcementImage.getDescription());
        announcementImageImpl.setOrder(announcementImage.getOrder());

        return announcementImageImpl;
    }

    /**
     * Returns the announcement image with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the announcement image
     * @return the announcement image
     * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException if a announcement image with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AnnouncementImage findByPrimaryKey(Serializable primaryKey)
        throws NoSuchAnnouncementImageException, SystemException {
        AnnouncementImage announcementImage = fetchByPrimaryKey(primaryKey);

        if (announcementImage == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchAnnouncementImageException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return announcementImage;
    }

    /**
     * Returns the announcement image with the primary key or throws a {@link com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException} if it could not be found.
     *
     * @param announcementImageId the primary key of the announcement image
     * @return the announcement image
     * @throws com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException if a announcement image with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AnnouncementImage findByPrimaryKey(long announcementImageId)
        throws NoSuchAnnouncementImageException, SystemException {
        return findByPrimaryKey((Serializable) announcementImageId);
    }

    /**
     * Returns the announcement image with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the announcement image
     * @return the announcement image, or <code>null</code> if a announcement image with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AnnouncementImage fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        AnnouncementImage announcementImage = (AnnouncementImage) EntityCacheUtil.getResult(AnnouncementImageModelImpl.ENTITY_CACHE_ENABLED,
                AnnouncementImageImpl.class, primaryKey);

        if (announcementImage == _nullAnnouncementImage) {
            return null;
        }

        if (announcementImage == null) {
            Session session = null;

            try {
                session = openSession();

                announcementImage = (AnnouncementImage) session.get(AnnouncementImageImpl.class,
                        primaryKey);

                if (announcementImage != null) {
                    cacheResult(announcementImage);
                } else {
                    EntityCacheUtil.putResult(AnnouncementImageModelImpl.ENTITY_CACHE_ENABLED,
                        AnnouncementImageImpl.class, primaryKey,
                        _nullAnnouncementImage);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(AnnouncementImageModelImpl.ENTITY_CACHE_ENABLED,
                    AnnouncementImageImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return announcementImage;
    }

    /**
     * Returns the announcement image with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param announcementImageId the primary key of the announcement image
     * @return the announcement image, or <code>null</code> if a announcement image with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public AnnouncementImage fetchByPrimaryKey(long announcementImageId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) announcementImageId);
    }

    /**
     * Returns all the announcement images.
     *
     * @return the announcement images
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AnnouncementImage> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the announcement images.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of announcement images
     * @param end the upper bound of the range of announcement images (not inclusive)
     * @return the range of announcement images
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AnnouncementImage> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the announcement images.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.AnnouncementImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of announcement images
     * @param end the upper bound of the range of announcement images (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of announcement images
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<AnnouncementImage> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<AnnouncementImage> list = (List<AnnouncementImage>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ANNOUNCEMENTIMAGE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ANNOUNCEMENTIMAGE;

                if (pagination) {
                    sql = sql.concat(AnnouncementImageModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<AnnouncementImage>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<AnnouncementImage>(list);
                } else {
                    list = (List<AnnouncementImage>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the announcement images from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (AnnouncementImage announcementImage : findAll()) {
            remove(announcementImage);
        }
    }

    /**
     * Returns the number of announcement images.
     *
     * @return the number of announcement images
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_ANNOUNCEMENTIMAGE);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the announcement image persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.gleo.plugins.hexiagon.model.AnnouncementImage")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<AnnouncementImage>> listenersList = new ArrayList<ModelListener<AnnouncementImage>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<AnnouncementImage>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(AnnouncementImageImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
