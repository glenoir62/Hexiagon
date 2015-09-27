package com.zenixia.plugins.hexiagon.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
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
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.security.permission.InlineSQLHelperUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.zenixia.plugins.hexiagon.NoSuchAnnouncementException;
import com.zenixia.plugins.hexiagon.model.Announcement;
import com.zenixia.plugins.hexiagon.model.impl.AnnouncementImpl;
import com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl;
import com.zenixia.plugins.hexiagon.service.persistence.AnnouncementPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the announcement service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author guillaumelenoir
 * @see AnnouncementPersistence
 * @see AnnouncementUtil
 * @generated
 */
public class AnnouncementPersistenceImpl extends BasePersistenceImpl<Announcement>
    implements AnnouncementPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link AnnouncementUtil} to access the announcement persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = AnnouncementImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementModelImpl.FINDER_CACHE_ENABLED, AnnouncementImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementModelImpl.FINDER_CACHE_ENABLED, AnnouncementImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementModelImpl.FINDER_CACHE_ENABLED, AnnouncementImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementModelImpl.FINDER_CACHE_ENABLED, AnnouncementImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
            new String[] { String.class.getName() },
            AnnouncementModelImpl.UUID_COLUMN_BITMASK |
            AnnouncementModelImpl.TITLE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_UUID_UUID_1 = "announcement.uuid IS NULL";
    private static final String _FINDER_COLUMN_UUID_UUID_2 = "announcement.uuid = ?";
    private static final String _FINDER_COLUMN_UUID_UUID_3 = "(announcement.uuid IS NULL OR announcement.uuid = '')";
    public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementModelImpl.FINDER_CACHE_ENABLED, AnnouncementImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() },
            AnnouncementModelImpl.UUID_COLUMN_BITMASK |
            AnnouncementModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "announcement.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "announcement.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(announcement.uuid IS NULL OR announcement.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "announcement.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementModelImpl.FINDER_CACHE_ENABLED, AnnouncementImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
            new String[] {
                String.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
        new FinderPath(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementModelImpl.FINDER_CACHE_ENABLED, AnnouncementImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() },
            AnnouncementModelImpl.UUID_COLUMN_BITMASK |
            AnnouncementModelImpl.COMPANYID_COLUMN_BITMASK |
            AnnouncementModelImpl.TITLE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
            new String[] { String.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "announcement.uuid IS NULL AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "announcement.uuid = ? AND ";
    private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(announcement.uuid IS NULL OR announcement.uuid = '') AND ";
    private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "announcement.companyId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementModelImpl.FINDER_CACHE_ENABLED, AnnouncementImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
        new FinderPath(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementModelImpl.FINDER_CACHE_ENABLED, AnnouncementImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
            new String[] { Long.class.getName() },
            AnnouncementModelImpl.GROUPID_COLUMN_BITMASK |
            AnnouncementModelImpl.TITLE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "announcement.groupId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_S = new FinderPath(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementModelImpl.FINDER_CACHE_ENABLED, AnnouncementImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_S",
            new String[] {
                Long.class.getName(), Integer.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S = new FinderPath(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementModelImpl.FINDER_CACHE_ENABLED, AnnouncementImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_S",
            new String[] { Long.class.getName(), Integer.class.getName() },
            AnnouncementModelImpl.GROUPID_COLUMN_BITMASK |
            AnnouncementModelImpl.STATUS_COLUMN_BITMASK |
            AnnouncementModelImpl.TITLE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_S = new FinderPath(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_S",
            new String[] { Long.class.getName(), Integer.class.getName() });
    private static final String _FINDER_COLUMN_G_S_GROUPID_2 = "announcement.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_S_STATUS_2 = "announcement.status = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TYPEID = new FinderPath(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementModelImpl.FINDER_CACHE_ENABLED, AnnouncementImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByTypeId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPEID =
        new FinderPath(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementModelImpl.FINDER_CACHE_ENABLED, AnnouncementImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByTypeId",
            new String[] { Long.class.getName() },
            AnnouncementModelImpl.TYPEID_COLUMN_BITMASK |
            AnnouncementModelImpl.TITLE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_TYPEID = new FinderPath(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByTypeId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_TYPEID_TYPEID_2 = "announcement.typeId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CURRENCYID =
        new FinderPath(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementModelImpl.FINDER_CACHE_ENABLED, AnnouncementImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCurrencyId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CURRENCYID =
        new FinderPath(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementModelImpl.FINDER_CACHE_ENABLED, AnnouncementImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCurrencyId",
            new String[] { Long.class.getName() },
            AnnouncementModelImpl.CURRENCYID_COLUMN_BITMASK |
            AnnouncementModelImpl.TITLE_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CURRENCYID = new FinderPath(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCurrencyId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_CURRENCYID_CURRENCYID_2 = "announcement.currencyId = ?";
    private static final String _SQL_SELECT_ANNOUNCEMENT = "SELECT announcement FROM Announcement announcement";
    private static final String _SQL_SELECT_ANNOUNCEMENT_WHERE = "SELECT announcement FROM Announcement announcement WHERE ";
    private static final String _SQL_COUNT_ANNOUNCEMENT = "SELECT COUNT(announcement) FROM Announcement announcement";
    private static final String _SQL_COUNT_ANNOUNCEMENT_WHERE = "SELECT COUNT(announcement) FROM Announcement announcement WHERE ";
    private static final String _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN = "announcement.announcementId";
    private static final String _FILTER_SQL_SELECT_ANNOUNCEMENT_WHERE = "SELECT DISTINCT {announcement.*} FROM Hexiagon_Announcement announcement WHERE ";
    private static final String _FILTER_SQL_SELECT_ANNOUNCEMENT_NO_INLINE_DISTINCT_WHERE_1 =
        "SELECT {Hexiagon_Announcement.*} FROM (SELECT DISTINCT announcement.announcementId FROM Hexiagon_Announcement announcement WHERE ";
    private static final String _FILTER_SQL_SELECT_ANNOUNCEMENT_NO_INLINE_DISTINCT_WHERE_2 =
        ") TEMP_TABLE INNER JOIN Hexiagon_Announcement ON TEMP_TABLE.announcementId = Hexiagon_Announcement.announcementId";
    private static final String _FILTER_SQL_COUNT_ANNOUNCEMENT_WHERE = "SELECT COUNT(DISTINCT announcement.announcementId) AS COUNT_VALUE FROM Hexiagon_Announcement announcement WHERE ";
    private static final String _FILTER_ENTITY_ALIAS = "announcement";
    private static final String _FILTER_ENTITY_TABLE = "Hexiagon_Announcement";
    private static final String _ORDER_BY_ENTITY_ALIAS = "announcement.";
    private static final String _ORDER_BY_ENTITY_TABLE = "Hexiagon_Announcement.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Announcement exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Announcement exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(AnnouncementPersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "uuid"
            });
    private static Announcement _nullAnnouncement = new AnnouncementImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Announcement> toCacheModel() {
                return _nullAnnouncementCacheModel;
            }
        };

    private static CacheModel<Announcement> _nullAnnouncementCacheModel = new CacheModel<Announcement>() {
            @Override
            public Announcement toEntityModel() {
                return _nullAnnouncement;
            }
        };

    public AnnouncementPersistenceImpl() {
        setModelClass(Announcement.class);
    }

    /**
     * Returns all the announcements where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the matching announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Announcement> findByUuid(String uuid) throws SystemException {
        return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the announcements where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param start the lower bound of the range of announcements
     * @param end the upper bound of the range of announcements (not inclusive)
     * @return the range of matching announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Announcement> findByUuid(String uuid, int start, int end)
        throws SystemException {
        return findByUuid(uuid, start, end, null);
    }

    /**
     * Returns an ordered range of all the announcements where uuid = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param start the lower bound of the range of announcements
     * @param end the upper bound of the range of announcements (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Announcement> findByUuid(String uuid, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
            finderArgs = new Object[] { uuid, start, end, orderByComparator };
        }

        List<Announcement> list = (List<Announcement>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Announcement announcement : list) {
                if (!Validator.equals(uuid, announcement.getUuid())) {
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

            query.append(_SQL_SELECT_ANNOUNCEMENT_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(AnnouncementModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                if (!pagination) {
                    list = (List<Announcement>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Announcement>(list);
                } else {
                    list = (List<Announcement>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Returns the first announcement in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching announcement
     * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement findByUuid_First(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchAnnouncementException, SystemException {
        Announcement announcement = fetchByUuid_First(uuid, orderByComparator);

        if (announcement != null) {
            return announcement;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAnnouncementException(msg.toString());
    }

    /**
     * Returns the first announcement in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching announcement, or <code>null</code> if a matching announcement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement fetchByUuid_First(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        List<Announcement> list = findByUuid(uuid, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last announcement in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching announcement
     * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement findByUuid_Last(String uuid,
        OrderByComparator orderByComparator)
        throws NoSuchAnnouncementException, SystemException {
        Announcement announcement = fetchByUuid_Last(uuid, orderByComparator);

        if (announcement != null) {
            return announcement;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAnnouncementException(msg.toString());
    }

    /**
     * Returns the last announcement in the ordered set where uuid = &#63;.
     *
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching announcement, or <code>null</code> if a matching announcement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement fetchByUuid_Last(String uuid,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid(uuid);

        if (count == 0) {
            return null;
        }

        List<Announcement> list = findByUuid(uuid, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the announcements before and after the current announcement in the ordered set where uuid = &#63;.
     *
     * @param announcementId the primary key of the current announcement
     * @param uuid the uuid
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next announcement
     * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement[] findByUuid_PrevAndNext(long announcementId,
        String uuid, OrderByComparator orderByComparator)
        throws NoSuchAnnouncementException, SystemException {
        Announcement announcement = findByPrimaryKey(announcementId);

        Session session = null;

        try {
            session = openSession();

            Announcement[] array = new AnnouncementImpl[3];

            array[0] = getByUuid_PrevAndNext(session, announcement, uuid,
                    orderByComparator, true);

            array[1] = announcement;

            array[2] = getByUuid_PrevAndNext(session, announcement, uuid,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Announcement getByUuid_PrevAndNext(Session session,
        Announcement announcement, String uuid,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ANNOUNCEMENT_WHERE);

        boolean bindUuid = false;

        if (uuid == null) {
            query.append(_FINDER_COLUMN_UUID_UUID_1);
        } else if (uuid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_UUID_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_UUID_2);
        }

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
            query.append(AnnouncementModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(announcement);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Announcement> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the announcements where uuid = &#63; from the database.
     *
     * @param uuid the uuid
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid(String uuid) throws SystemException {
        for (Announcement announcement : findByUuid(uuid, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(announcement);
        }
    }

    /**
     * Returns the number of announcements where uuid = &#63;.
     *
     * @param uuid the uuid
     * @return the number of matching announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUuid(String uuid) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

        Object[] finderArgs = new Object[] { uuid };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ANNOUNCEMENT_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_UUID_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

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
     * Returns the announcement where uuid = &#63; and groupId = &#63; or throws a {@link com.zenixia.plugins.hexiagon.NoSuchAnnouncementException} if it could not be found.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching announcement
     * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement findByUUID_G(String uuid, long groupId)
        throws NoSuchAnnouncementException, SystemException {
        Announcement announcement = fetchByUUID_G(uuid, groupId);

        if (announcement == null) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("uuid=");
            msg.append(uuid);

            msg.append(", groupId=");
            msg.append(groupId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchAnnouncementException(msg.toString());
        }

        return announcement;
    }

    /**
     * Returns the announcement where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the matching announcement, or <code>null</code> if a matching announcement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement fetchByUUID_G(String uuid, long groupId)
        throws SystemException {
        return fetchByUUID_G(uuid, groupId, true);
    }

    /**
     * Returns the announcement where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching announcement, or <code>null</code> if a matching announcement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement fetchByUUID_G(String uuid, long groupId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { uuid, groupId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs, this);
        }

        if (result instanceof Announcement) {
            Announcement announcement = (Announcement) result;

            if (!Validator.equals(uuid, announcement.getUuid()) ||
                    (groupId != announcement.getGroupId())) {
                result = null;
            }
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_ANNOUNCEMENT_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_G_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(groupId);

                List<Announcement> list = q.list();

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                        finderArgs, list);
                } else {
                    Announcement announcement = list.get(0);

                    result = announcement;

                    cacheResult(announcement);

                    if ((announcement.getUuid() == null) ||
                            !announcement.getUuid().equals(uuid) ||
                            (announcement.getGroupId() != groupId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
                            finderArgs, announcement);
                    }
                }
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        if (result instanceof List<?>) {
            return null;
        } else {
            return (Announcement) result;
        }
    }

    /**
     * Removes the announcement where uuid = &#63; and groupId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the announcement that was removed
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement removeByUUID_G(String uuid, long groupId)
        throws NoSuchAnnouncementException, SystemException {
        Announcement announcement = findByUUID_G(uuid, groupId);

        return remove(announcement);
    }

    /**
     * Returns the number of announcements where uuid = &#63; and groupId = &#63;.
     *
     * @param uuid the uuid
     * @param groupId the group ID
     * @return the number of matching announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUUID_G(String uuid, long groupId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

        Object[] finderArgs = new Object[] { uuid, groupId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_ANNOUNCEMENT_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_G_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_G_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(groupId);

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
     * Returns all the announcements where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the matching announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Announcement> findByUuid_C(String uuid, long companyId)
        throws SystemException {
        return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the announcements where uuid = &#63; and companyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param start the lower bound of the range of announcements
     * @param end the upper bound of the range of announcements (not inclusive)
     * @return the range of matching announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Announcement> findByUuid_C(String uuid, long companyId,
        int start, int end) throws SystemException {
        return findByUuid_C(uuid, companyId, start, end, null);
    }

    /**
     * Returns an ordered range of all the announcements where uuid = &#63; and companyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param start the lower bound of the range of announcements
     * @param end the upper bound of the range of announcements (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Announcement> findByUuid_C(String uuid, long companyId,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
            finderArgs = new Object[] { uuid, companyId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
            finderArgs = new Object[] {
                    uuid, companyId,
                    
                    start, end, orderByComparator
                };
        }

        List<Announcement> list = (List<Announcement>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Announcement announcement : list) {
                if (!Validator.equals(uuid, announcement.getUuid()) ||
                        (companyId != announcement.getCompanyId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_ANNOUNCEMENT_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_C_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(AnnouncementModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(companyId);

                if (!pagination) {
                    list = (List<Announcement>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Announcement>(list);
                } else {
                    list = (List<Announcement>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Returns the first announcement in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching announcement
     * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement findByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchAnnouncementException, SystemException {
        Announcement announcement = fetchByUuid_C_First(uuid, companyId,
                orderByComparator);

        if (announcement != null) {
            return announcement;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAnnouncementException(msg.toString());
    }

    /**
     * Returns the first announcement in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching announcement, or <code>null</code> if a matching announcement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement fetchByUuid_C_First(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Announcement> list = findByUuid_C(uuid, companyId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last announcement in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching announcement
     * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement findByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchAnnouncementException, SystemException {
        Announcement announcement = fetchByUuid_C_Last(uuid, companyId,
                orderByComparator);

        if (announcement != null) {
            return announcement;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("uuid=");
        msg.append(uuid);

        msg.append(", companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAnnouncementException(msg.toString());
    }

    /**
     * Returns the last announcement in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching announcement, or <code>null</code> if a matching announcement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement fetchByUuid_C_Last(String uuid, long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUuid_C(uuid, companyId);

        if (count == 0) {
            return null;
        }

        List<Announcement> list = findByUuid_C(uuid, companyId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the announcements before and after the current announcement in the ordered set where uuid = &#63; and companyId = &#63;.
     *
     * @param announcementId the primary key of the current announcement
     * @param uuid the uuid
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next announcement
     * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement[] findByUuid_C_PrevAndNext(long announcementId,
        String uuid, long companyId, OrderByComparator orderByComparator)
        throws NoSuchAnnouncementException, SystemException {
        Announcement announcement = findByPrimaryKey(announcementId);

        Session session = null;

        try {
            session = openSession();

            Announcement[] array = new AnnouncementImpl[3];

            array[0] = getByUuid_C_PrevAndNext(session, announcement, uuid,
                    companyId, orderByComparator, true);

            array[1] = announcement;

            array[2] = getByUuid_C_PrevAndNext(session, announcement, uuid,
                    companyId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Announcement getByUuid_C_PrevAndNext(Session session,
        Announcement announcement, String uuid, long companyId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ANNOUNCEMENT_WHERE);

        boolean bindUuid = false;

        if (uuid == null) {
            query.append(_FINDER_COLUMN_UUID_C_UUID_1);
        } else if (uuid.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_UUID_C_UUID_3);
        } else {
            bindUuid = true;

            query.append(_FINDER_COLUMN_UUID_C_UUID_2);
        }

        query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

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
            query.append(AnnouncementModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindUuid) {
            qPos.add(uuid);
        }

        qPos.add(companyId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(announcement);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Announcement> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the announcements where uuid = &#63; and companyId = &#63; from the database.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUuid_C(String uuid, long companyId)
        throws SystemException {
        for (Announcement announcement : findByUuid_C(uuid, companyId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(announcement);
        }
    }

    /**
     * Returns the number of announcements where uuid = &#63; and companyId = &#63;.
     *
     * @param uuid the uuid
     * @param companyId the company ID
     * @return the number of matching announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUuid_C(String uuid, long companyId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

        Object[] finderArgs = new Object[] { uuid, companyId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_ANNOUNCEMENT_WHERE);

            boolean bindUuid = false;

            if (uuid == null) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_1);
            } else if (uuid.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_UUID_C_UUID_3);
            } else {
                bindUuid = true;

                query.append(_FINDER_COLUMN_UUID_C_UUID_2);
            }

            query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindUuid) {
                    qPos.add(uuid);
                }

                qPos.add(companyId);

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
     * Returns all the announcements where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the matching announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Announcement> findByGroupId(long groupId)
        throws SystemException {
        return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the announcements where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of announcements
     * @param end the upper bound of the range of announcements (not inclusive)
     * @return the range of matching announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Announcement> findByGroupId(long groupId, int start, int end)
        throws SystemException {
        return findByGroupId(groupId, start, end, null);
    }

    /**
     * Returns an ordered range of all the announcements where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of announcements
     * @param end the upper bound of the range of announcements (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Announcement> findByGroupId(long groupId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId, start, end, orderByComparator };
        }

        List<Announcement> list = (List<Announcement>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Announcement announcement : list) {
                if ((groupId != announcement.getGroupId())) {
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

            query.append(_SQL_SELECT_ANNOUNCEMENT_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(AnnouncementModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (!pagination) {
                    list = (List<Announcement>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Announcement>(list);
                } else {
                    list = (List<Announcement>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Returns the first announcement in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching announcement
     * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement findByGroupId_First(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchAnnouncementException, SystemException {
        Announcement announcement = fetchByGroupId_First(groupId,
                orderByComparator);

        if (announcement != null) {
            return announcement;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAnnouncementException(msg.toString());
    }

    /**
     * Returns the first announcement in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching announcement, or <code>null</code> if a matching announcement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement fetchByGroupId_First(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Announcement> list = findByGroupId(groupId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last announcement in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching announcement
     * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement findByGroupId_Last(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchAnnouncementException, SystemException {
        Announcement announcement = fetchByGroupId_Last(groupId,
                orderByComparator);

        if (announcement != null) {
            return announcement;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAnnouncementException(msg.toString());
    }

    /**
     * Returns the last announcement in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching announcement, or <code>null</code> if a matching announcement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement fetchByGroupId_Last(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByGroupId(groupId);

        if (count == 0) {
            return null;
        }

        List<Announcement> list = findByGroupId(groupId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the announcements before and after the current announcement in the ordered set where groupId = &#63;.
     *
     * @param announcementId the primary key of the current announcement
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next announcement
     * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement[] findByGroupId_PrevAndNext(long announcementId,
        long groupId, OrderByComparator orderByComparator)
        throws NoSuchAnnouncementException, SystemException {
        Announcement announcement = findByPrimaryKey(announcementId);

        Session session = null;

        try {
            session = openSession();

            Announcement[] array = new AnnouncementImpl[3];

            array[0] = getByGroupId_PrevAndNext(session, announcement, groupId,
                    orderByComparator, true);

            array[1] = announcement;

            array[2] = getByGroupId_PrevAndNext(session, announcement, groupId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Announcement getByGroupId_PrevAndNext(Session session,
        Announcement announcement, long groupId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ANNOUNCEMENT_WHERE);

        query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

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
            query.append(AnnouncementModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(announcement);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Announcement> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the announcements that the user has permission to view where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the matching announcements that the user has permission to view
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Announcement> filterFindByGroupId(long groupId)
        throws SystemException {
        return filterFindByGroupId(groupId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the announcements that the user has permission to view where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of announcements
     * @param end the upper bound of the range of announcements (not inclusive)
     * @return the range of matching announcements that the user has permission to view
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Announcement> filterFindByGroupId(long groupId, int start,
        int end) throws SystemException {
        return filterFindByGroupId(groupId, start, end, null);
    }

    /**
     * Returns an ordered range of all the announcements that the user has permissions to view where groupId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param start the lower bound of the range of announcements
     * @param end the upper bound of the range of announcements (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching announcements that the user has permission to view
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Announcement> filterFindByGroupId(long groupId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        if (!InlineSQLHelperUtil.isEnabled(groupId)) {
            return findByGroupId(groupId, start, end, orderByComparator);
        }

        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(3 +
                    (orderByComparator.getOrderByFields().length * 3));
        } else {
            query = new StringBundler(3);
        }

        if (getDB().isSupportsInlineDistinct()) {
            query.append(_FILTER_SQL_SELECT_ANNOUNCEMENT_WHERE);
        } else {
            query.append(_FILTER_SQL_SELECT_ANNOUNCEMENT_NO_INLINE_DISTINCT_WHERE_1);
        }

        query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

        if (!getDB().isSupportsInlineDistinct()) {
            query.append(_FILTER_SQL_SELECT_ANNOUNCEMENT_NO_INLINE_DISTINCT_WHERE_2);
        }

        if (orderByComparator != null) {
            if (getDB().isSupportsInlineDistinct()) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator, true);
            } else {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
                    orderByComparator, true);
            }
        } else {
            if (getDB().isSupportsInlineDistinct()) {
                query.append(AnnouncementModelImpl.ORDER_BY_JPQL);
            } else {
                query.append(AnnouncementModelImpl.ORDER_BY_SQL);
            }
        }

        String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
                Announcement.class.getName(),
                _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

        Session session = null;

        try {
            session = openSession();

            SQLQuery q = session.createSQLQuery(sql);

            if (getDB().isSupportsInlineDistinct()) {
                q.addEntity(_FILTER_ENTITY_ALIAS, AnnouncementImpl.class);
            } else {
                q.addEntity(_FILTER_ENTITY_TABLE, AnnouncementImpl.class);
            }

            QueryPos qPos = QueryPos.getInstance(q);

            qPos.add(groupId);

            return (List<Announcement>) QueryUtil.list(q, getDialect(), start,
                end);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    /**
     * Returns the announcements before and after the current announcement in the ordered set of announcements that the user has permission to view where groupId = &#63;.
     *
     * @param announcementId the primary key of the current announcement
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next announcement
     * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement[] filterFindByGroupId_PrevAndNext(long announcementId,
        long groupId, OrderByComparator orderByComparator)
        throws NoSuchAnnouncementException, SystemException {
        if (!InlineSQLHelperUtil.isEnabled(groupId)) {
            return findByGroupId_PrevAndNext(announcementId, groupId,
                orderByComparator);
        }

        Announcement announcement = findByPrimaryKey(announcementId);

        Session session = null;

        try {
            session = openSession();

            Announcement[] array = new AnnouncementImpl[3];

            array[0] = filterGetByGroupId_PrevAndNext(session, announcement,
                    groupId, orderByComparator, true);

            array[1] = announcement;

            array[2] = filterGetByGroupId_PrevAndNext(session, announcement,
                    groupId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Announcement filterGetByGroupId_PrevAndNext(Session session,
        Announcement announcement, long groupId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        if (getDB().isSupportsInlineDistinct()) {
            query.append(_FILTER_SQL_SELECT_ANNOUNCEMENT_WHERE);
        } else {
            query.append(_FILTER_SQL_SELECT_ANNOUNCEMENT_NO_INLINE_DISTINCT_WHERE_1);
        }

        query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

        if (!getDB().isSupportsInlineDistinct()) {
            query.append(_FILTER_SQL_SELECT_ANNOUNCEMENT_NO_INLINE_DISTINCT_WHERE_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                if (getDB().isSupportsInlineDistinct()) {
                    query.append(_ORDER_BY_ENTITY_ALIAS);
                } else {
                    query.append(_ORDER_BY_ENTITY_TABLE);
                }

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
                if (getDB().isSupportsInlineDistinct()) {
                    query.append(_ORDER_BY_ENTITY_ALIAS);
                } else {
                    query.append(_ORDER_BY_ENTITY_TABLE);
                }

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
            if (getDB().isSupportsInlineDistinct()) {
                query.append(AnnouncementModelImpl.ORDER_BY_JPQL);
            } else {
                query.append(AnnouncementModelImpl.ORDER_BY_SQL);
            }
        }

        String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
                Announcement.class.getName(),
                _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

        SQLQuery q = session.createSQLQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        if (getDB().isSupportsInlineDistinct()) {
            q.addEntity(_FILTER_ENTITY_ALIAS, AnnouncementImpl.class);
        } else {
            q.addEntity(_FILTER_ENTITY_TABLE, AnnouncementImpl.class);
        }

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(announcement);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Announcement> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the announcements where groupId = &#63; from the database.
     *
     * @param groupId the group ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByGroupId(long groupId) throws SystemException {
        for (Announcement announcement : findByGroupId(groupId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(announcement);
        }
    }

    /**
     * Returns the number of announcements where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the number of matching announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByGroupId(long groupId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_GROUPID;

        Object[] finderArgs = new Object[] { groupId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ANNOUNCEMENT_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

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
     * Returns the number of announcements that the user has permission to view where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the number of matching announcements that the user has permission to view
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int filterCountByGroupId(long groupId) throws SystemException {
        if (!InlineSQLHelperUtil.isEnabled(groupId)) {
            return countByGroupId(groupId);
        }

        StringBundler query = new StringBundler(2);

        query.append(_FILTER_SQL_COUNT_ANNOUNCEMENT_WHERE);

        query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

        String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
                Announcement.class.getName(),
                _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

        Session session = null;

        try {
            session = openSession();

            SQLQuery q = session.createSQLQuery(sql);

            q.addScalar(COUNT_COLUMN_NAME,
                com.liferay.portal.kernel.dao.orm.Type.LONG);

            QueryPos qPos = QueryPos.getInstance(q);

            qPos.add(groupId);

            Long count = (Long) q.uniqueResult();

            return count.intValue();
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    /**
     * Returns all the announcements where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status the status
     * @return the matching announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Announcement> findByG_S(long groupId, int status)
        throws SystemException {
        return findByG_S(groupId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the announcements where groupId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param status the status
     * @param start the lower bound of the range of announcements
     * @param end the upper bound of the range of announcements (not inclusive)
     * @return the range of matching announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Announcement> findByG_S(long groupId, int status, int start,
        int end) throws SystemException {
        return findByG_S(groupId, status, start, end, null);
    }

    /**
     * Returns an ordered range of all the announcements where groupId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param status the status
     * @param start the lower bound of the range of announcements
     * @param end the upper bound of the range of announcements (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Announcement> findByG_S(long groupId, int status, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S;
            finderArgs = new Object[] { groupId, status };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_S;
            finderArgs = new Object[] {
                    groupId, status,
                    
                    start, end, orderByComparator
                };
        }

        List<Announcement> list = (List<Announcement>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Announcement announcement : list) {
                if ((groupId != announcement.getGroupId()) ||
                        (status != announcement.getStatus())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_ANNOUNCEMENT_WHERE);

            query.append(_FINDER_COLUMN_G_S_GROUPID_2);

            query.append(_FINDER_COLUMN_G_S_STATUS_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(AnnouncementModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(status);

                if (!pagination) {
                    list = (List<Announcement>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Announcement>(list);
                } else {
                    list = (List<Announcement>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Returns the first announcement in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching announcement
     * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement findByG_S_First(long groupId, int status,
        OrderByComparator orderByComparator)
        throws NoSuchAnnouncementException, SystemException {
        Announcement announcement = fetchByG_S_First(groupId, status,
                orderByComparator);

        if (announcement != null) {
            return announcement;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAnnouncementException(msg.toString());
    }

    /**
     * Returns the first announcement in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching announcement, or <code>null</code> if a matching announcement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement fetchByG_S_First(long groupId, int status,
        OrderByComparator orderByComparator) throws SystemException {
        List<Announcement> list = findByG_S(groupId, status, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last announcement in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching announcement
     * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement findByG_S_Last(long groupId, int status,
        OrderByComparator orderByComparator)
        throws NoSuchAnnouncementException, SystemException {
        Announcement announcement = fetchByG_S_Last(groupId, status,
                orderByComparator);

        if (announcement != null) {
            return announcement;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAnnouncementException(msg.toString());
    }

    /**
     * Returns the last announcement in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching announcement, or <code>null</code> if a matching announcement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement fetchByG_S_Last(long groupId, int status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_S(groupId, status);

        if (count == 0) {
            return null;
        }

        List<Announcement> list = findByG_S(groupId, status, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the announcements before and after the current announcement in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param announcementId the primary key of the current announcement
     * @param groupId the group ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next announcement
     * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement[] findByG_S_PrevAndNext(long announcementId,
        long groupId, int status, OrderByComparator orderByComparator)
        throws NoSuchAnnouncementException, SystemException {
        Announcement announcement = findByPrimaryKey(announcementId);

        Session session = null;

        try {
            session = openSession();

            Announcement[] array = new AnnouncementImpl[3];

            array[0] = getByG_S_PrevAndNext(session, announcement, groupId,
                    status, orderByComparator, true);

            array[1] = announcement;

            array[2] = getByG_S_PrevAndNext(session, announcement, groupId,
                    status, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Announcement getByG_S_PrevAndNext(Session session,
        Announcement announcement, long groupId, int status,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ANNOUNCEMENT_WHERE);

        query.append(_FINDER_COLUMN_G_S_GROUPID_2);

        query.append(_FINDER_COLUMN_G_S_STATUS_2);

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
            query.append(AnnouncementModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        qPos.add(status);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(announcement);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Announcement> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the announcements that the user has permission to view where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status the status
     * @return the matching announcements that the user has permission to view
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Announcement> filterFindByG_S(long groupId, int status)
        throws SystemException {
        return filterFindByG_S(groupId, status, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the announcements that the user has permission to view where groupId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param status the status
     * @param start the lower bound of the range of announcements
     * @param end the upper bound of the range of announcements (not inclusive)
     * @return the range of matching announcements that the user has permission to view
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Announcement> filterFindByG_S(long groupId, int status,
        int start, int end) throws SystemException {
        return filterFindByG_S(groupId, status, start, end, null);
    }

    /**
     * Returns an ordered range of all the announcements that the user has permissions to view where groupId = &#63; and status = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param groupId the group ID
     * @param status the status
     * @param start the lower bound of the range of announcements
     * @param end the upper bound of the range of announcements (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching announcements that the user has permission to view
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Announcement> filterFindByG_S(long groupId, int status,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        if (!InlineSQLHelperUtil.isEnabled(groupId)) {
            return findByG_S(groupId, status, start, end, orderByComparator);
        }

        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(4 +
                    (orderByComparator.getOrderByFields().length * 3));
        } else {
            query = new StringBundler(4);
        }

        if (getDB().isSupportsInlineDistinct()) {
            query.append(_FILTER_SQL_SELECT_ANNOUNCEMENT_WHERE);
        } else {
            query.append(_FILTER_SQL_SELECT_ANNOUNCEMENT_NO_INLINE_DISTINCT_WHERE_1);
        }

        query.append(_FINDER_COLUMN_G_S_GROUPID_2);

        query.append(_FINDER_COLUMN_G_S_STATUS_2);

        if (!getDB().isSupportsInlineDistinct()) {
            query.append(_FILTER_SQL_SELECT_ANNOUNCEMENT_NO_INLINE_DISTINCT_WHERE_2);
        }

        if (orderByComparator != null) {
            if (getDB().isSupportsInlineDistinct()) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator, true);
            } else {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
                    orderByComparator, true);
            }
        } else {
            if (getDB().isSupportsInlineDistinct()) {
                query.append(AnnouncementModelImpl.ORDER_BY_JPQL);
            } else {
                query.append(AnnouncementModelImpl.ORDER_BY_SQL);
            }
        }

        String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
                Announcement.class.getName(),
                _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

        Session session = null;

        try {
            session = openSession();

            SQLQuery q = session.createSQLQuery(sql);

            if (getDB().isSupportsInlineDistinct()) {
                q.addEntity(_FILTER_ENTITY_ALIAS, AnnouncementImpl.class);
            } else {
                q.addEntity(_FILTER_ENTITY_TABLE, AnnouncementImpl.class);
            }

            QueryPos qPos = QueryPos.getInstance(q);

            qPos.add(groupId);

            qPos.add(status);

            return (List<Announcement>) QueryUtil.list(q, getDialect(), start,
                end);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    /**
     * Returns the announcements before and after the current announcement in the ordered set of announcements that the user has permission to view where groupId = &#63; and status = &#63;.
     *
     * @param announcementId the primary key of the current announcement
     * @param groupId the group ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next announcement
     * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement[] filterFindByG_S_PrevAndNext(long announcementId,
        long groupId, int status, OrderByComparator orderByComparator)
        throws NoSuchAnnouncementException, SystemException {
        if (!InlineSQLHelperUtil.isEnabled(groupId)) {
            return findByG_S_PrevAndNext(announcementId, groupId, status,
                orderByComparator);
        }

        Announcement announcement = findByPrimaryKey(announcementId);

        Session session = null;

        try {
            session = openSession();

            Announcement[] array = new AnnouncementImpl[3];

            array[0] = filterGetByG_S_PrevAndNext(session, announcement,
                    groupId, status, orderByComparator, true);

            array[1] = announcement;

            array[2] = filterGetByG_S_PrevAndNext(session, announcement,
                    groupId, status, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Announcement filterGetByG_S_PrevAndNext(Session session,
        Announcement announcement, long groupId, int status,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        if (getDB().isSupportsInlineDistinct()) {
            query.append(_FILTER_SQL_SELECT_ANNOUNCEMENT_WHERE);
        } else {
            query.append(_FILTER_SQL_SELECT_ANNOUNCEMENT_NO_INLINE_DISTINCT_WHERE_1);
        }

        query.append(_FINDER_COLUMN_G_S_GROUPID_2);

        query.append(_FINDER_COLUMN_G_S_STATUS_2);

        if (!getDB().isSupportsInlineDistinct()) {
            query.append(_FILTER_SQL_SELECT_ANNOUNCEMENT_NO_INLINE_DISTINCT_WHERE_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                if (getDB().isSupportsInlineDistinct()) {
                    query.append(_ORDER_BY_ENTITY_ALIAS);
                } else {
                    query.append(_ORDER_BY_ENTITY_TABLE);
                }

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
                if (getDB().isSupportsInlineDistinct()) {
                    query.append(_ORDER_BY_ENTITY_ALIAS);
                } else {
                    query.append(_ORDER_BY_ENTITY_TABLE);
                }

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
            if (getDB().isSupportsInlineDistinct()) {
                query.append(AnnouncementModelImpl.ORDER_BY_JPQL);
            } else {
                query.append(AnnouncementModelImpl.ORDER_BY_SQL);
            }
        }

        String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
                Announcement.class.getName(),
                _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

        SQLQuery q = session.createSQLQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        if (getDB().isSupportsInlineDistinct()) {
            q.addEntity(_FILTER_ENTITY_ALIAS, AnnouncementImpl.class);
        } else {
            q.addEntity(_FILTER_ENTITY_TABLE, AnnouncementImpl.class);
        }

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        qPos.add(status);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(announcement);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Announcement> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the announcements where groupId = &#63; and status = &#63; from the database.
     *
     * @param groupId the group ID
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByG_S(long groupId, int status) throws SystemException {
        for (Announcement announcement : findByG_S(groupId, status,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(announcement);
        }
    }

    /**
     * Returns the number of announcements where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status the status
     * @return the number of matching announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByG_S(long groupId, int status) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_G_S;

        Object[] finderArgs = new Object[] { groupId, status };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_ANNOUNCEMENT_WHERE);

            query.append(_FINDER_COLUMN_G_S_GROUPID_2);

            query.append(_FINDER_COLUMN_G_S_STATUS_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(status);

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
     * Returns the number of announcements that the user has permission to view where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status the status
     * @return the number of matching announcements that the user has permission to view
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int filterCountByG_S(long groupId, int status)
        throws SystemException {
        if (!InlineSQLHelperUtil.isEnabled(groupId)) {
            return countByG_S(groupId, status);
        }

        StringBundler query = new StringBundler(3);

        query.append(_FILTER_SQL_COUNT_ANNOUNCEMENT_WHERE);

        query.append(_FINDER_COLUMN_G_S_GROUPID_2);

        query.append(_FINDER_COLUMN_G_S_STATUS_2);

        String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
                Announcement.class.getName(),
                _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

        Session session = null;

        try {
            session = openSession();

            SQLQuery q = session.createSQLQuery(sql);

            q.addScalar(COUNT_COLUMN_NAME,
                com.liferay.portal.kernel.dao.orm.Type.LONG);

            QueryPos qPos = QueryPos.getInstance(q);

            qPos.add(groupId);

            qPos.add(status);

            Long count = (Long) q.uniqueResult();

            return count.intValue();
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    /**
     * Returns all the announcements where typeId = &#63;.
     *
     * @param typeId the type ID
     * @return the matching announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Announcement> findByTypeId(long typeId)
        throws SystemException {
        return findByTypeId(typeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the announcements where typeId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param typeId the type ID
     * @param start the lower bound of the range of announcements
     * @param end the upper bound of the range of announcements (not inclusive)
     * @return the range of matching announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Announcement> findByTypeId(long typeId, int start, int end)
        throws SystemException {
        return findByTypeId(typeId, start, end, null);
    }

    /**
     * Returns an ordered range of all the announcements where typeId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param typeId the type ID
     * @param start the lower bound of the range of announcements
     * @param end the upper bound of the range of announcements (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Announcement> findByTypeId(long typeId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPEID;
            finderArgs = new Object[] { typeId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TYPEID;
            finderArgs = new Object[] { typeId, start, end, orderByComparator };
        }

        List<Announcement> list = (List<Announcement>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Announcement announcement : list) {
                if ((typeId != announcement.getTypeId())) {
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

            query.append(_SQL_SELECT_ANNOUNCEMENT_WHERE);

            query.append(_FINDER_COLUMN_TYPEID_TYPEID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(AnnouncementModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(typeId);

                if (!pagination) {
                    list = (List<Announcement>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Announcement>(list);
                } else {
                    list = (List<Announcement>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Returns the first announcement in the ordered set where typeId = &#63;.
     *
     * @param typeId the type ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching announcement
     * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement findByTypeId_First(long typeId,
        OrderByComparator orderByComparator)
        throws NoSuchAnnouncementException, SystemException {
        Announcement announcement = fetchByTypeId_First(typeId,
                orderByComparator);

        if (announcement != null) {
            return announcement;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("typeId=");
        msg.append(typeId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAnnouncementException(msg.toString());
    }

    /**
     * Returns the first announcement in the ordered set where typeId = &#63;.
     *
     * @param typeId the type ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching announcement, or <code>null</code> if a matching announcement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement fetchByTypeId_First(long typeId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Announcement> list = findByTypeId(typeId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last announcement in the ordered set where typeId = &#63;.
     *
     * @param typeId the type ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching announcement
     * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement findByTypeId_Last(long typeId,
        OrderByComparator orderByComparator)
        throws NoSuchAnnouncementException, SystemException {
        Announcement announcement = fetchByTypeId_Last(typeId, orderByComparator);

        if (announcement != null) {
            return announcement;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("typeId=");
        msg.append(typeId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAnnouncementException(msg.toString());
    }

    /**
     * Returns the last announcement in the ordered set where typeId = &#63;.
     *
     * @param typeId the type ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching announcement, or <code>null</code> if a matching announcement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement fetchByTypeId_Last(long typeId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByTypeId(typeId);

        if (count == 0) {
            return null;
        }

        List<Announcement> list = findByTypeId(typeId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the announcements before and after the current announcement in the ordered set where typeId = &#63;.
     *
     * @param announcementId the primary key of the current announcement
     * @param typeId the type ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next announcement
     * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement[] findByTypeId_PrevAndNext(long announcementId,
        long typeId, OrderByComparator orderByComparator)
        throws NoSuchAnnouncementException, SystemException {
        Announcement announcement = findByPrimaryKey(announcementId);

        Session session = null;

        try {
            session = openSession();

            Announcement[] array = new AnnouncementImpl[3];

            array[0] = getByTypeId_PrevAndNext(session, announcement, typeId,
                    orderByComparator, true);

            array[1] = announcement;

            array[2] = getByTypeId_PrevAndNext(session, announcement, typeId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Announcement getByTypeId_PrevAndNext(Session session,
        Announcement announcement, long typeId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ANNOUNCEMENT_WHERE);

        query.append(_FINDER_COLUMN_TYPEID_TYPEID_2);

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
            query.append(AnnouncementModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(typeId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(announcement);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Announcement> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the announcements where typeId = &#63; from the database.
     *
     * @param typeId the type ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByTypeId(long typeId) throws SystemException {
        for (Announcement announcement : findByTypeId(typeId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(announcement);
        }
    }

    /**
     * Returns the number of announcements where typeId = &#63;.
     *
     * @param typeId the type ID
     * @return the number of matching announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByTypeId(long typeId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_TYPEID;

        Object[] finderArgs = new Object[] { typeId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ANNOUNCEMENT_WHERE);

            query.append(_FINDER_COLUMN_TYPEID_TYPEID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(typeId);

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
     * Returns all the announcements where currencyId = &#63;.
     *
     * @param currencyId the currency ID
     * @return the matching announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Announcement> findByCurrencyId(long currencyId)
        throws SystemException {
        return findByCurrencyId(currencyId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the announcements where currencyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param currencyId the currency ID
     * @param start the lower bound of the range of announcements
     * @param end the upper bound of the range of announcements (not inclusive)
     * @return the range of matching announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Announcement> findByCurrencyId(long currencyId, int start,
        int end) throws SystemException {
        return findByCurrencyId(currencyId, start, end, null);
    }

    /**
     * Returns an ordered range of all the announcements where currencyId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param currencyId the currency ID
     * @param start the lower bound of the range of announcements
     * @param end the upper bound of the range of announcements (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Announcement> findByCurrencyId(long currencyId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CURRENCYID;
            finderArgs = new Object[] { currencyId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CURRENCYID;
            finderArgs = new Object[] { currencyId, start, end, orderByComparator };
        }

        List<Announcement> list = (List<Announcement>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Announcement announcement : list) {
                if ((currencyId != announcement.getCurrencyId())) {
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

            query.append(_SQL_SELECT_ANNOUNCEMENT_WHERE);

            query.append(_FINDER_COLUMN_CURRENCYID_CURRENCYID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(AnnouncementModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(currencyId);

                if (!pagination) {
                    list = (List<Announcement>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Announcement>(list);
                } else {
                    list = (List<Announcement>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Returns the first announcement in the ordered set where currencyId = &#63;.
     *
     * @param currencyId the currency ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching announcement
     * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement findByCurrencyId_First(long currencyId,
        OrderByComparator orderByComparator)
        throws NoSuchAnnouncementException, SystemException {
        Announcement announcement = fetchByCurrencyId_First(currencyId,
                orderByComparator);

        if (announcement != null) {
            return announcement;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("currencyId=");
        msg.append(currencyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAnnouncementException(msg.toString());
    }

    /**
     * Returns the first announcement in the ordered set where currencyId = &#63;.
     *
     * @param currencyId the currency ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching announcement, or <code>null</code> if a matching announcement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement fetchByCurrencyId_First(long currencyId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Announcement> list = findByCurrencyId(currencyId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last announcement in the ordered set where currencyId = &#63;.
     *
     * @param currencyId the currency ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching announcement
     * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a matching announcement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement findByCurrencyId_Last(long currencyId,
        OrderByComparator orderByComparator)
        throws NoSuchAnnouncementException, SystemException {
        Announcement announcement = fetchByCurrencyId_Last(currencyId,
                orderByComparator);

        if (announcement != null) {
            return announcement;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("currencyId=");
        msg.append(currencyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAnnouncementException(msg.toString());
    }

    /**
     * Returns the last announcement in the ordered set where currencyId = &#63;.
     *
     * @param currencyId the currency ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching announcement, or <code>null</code> if a matching announcement could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement fetchByCurrencyId_Last(long currencyId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByCurrencyId(currencyId);

        if (count == 0) {
            return null;
        }

        List<Announcement> list = findByCurrencyId(currencyId, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the announcements before and after the current announcement in the ordered set where currencyId = &#63;.
     *
     * @param announcementId the primary key of the current announcement
     * @param currencyId the currency ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next announcement
     * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement[] findByCurrencyId_PrevAndNext(long announcementId,
        long currencyId, OrderByComparator orderByComparator)
        throws NoSuchAnnouncementException, SystemException {
        Announcement announcement = findByPrimaryKey(announcementId);

        Session session = null;

        try {
            session = openSession();

            Announcement[] array = new AnnouncementImpl[3];

            array[0] = getByCurrencyId_PrevAndNext(session, announcement,
                    currencyId, orderByComparator, true);

            array[1] = announcement;

            array[2] = getByCurrencyId_PrevAndNext(session, announcement,
                    currencyId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Announcement getByCurrencyId_PrevAndNext(Session session,
        Announcement announcement, long currencyId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ANNOUNCEMENT_WHERE);

        query.append(_FINDER_COLUMN_CURRENCYID_CURRENCYID_2);

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
            query.append(AnnouncementModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(currencyId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(announcement);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Announcement> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the announcements where currencyId = &#63; from the database.
     *
     * @param currencyId the currency ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByCurrencyId(long currencyId) throws SystemException {
        for (Announcement announcement : findByCurrencyId(currencyId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(announcement);
        }
    }

    /**
     * Returns the number of announcements where currencyId = &#63;.
     *
     * @param currencyId the currency ID
     * @return the number of matching announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByCurrencyId(long currencyId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_CURRENCYID;

        Object[] finderArgs = new Object[] { currencyId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ANNOUNCEMENT_WHERE);

            query.append(_FINDER_COLUMN_CURRENCYID_CURRENCYID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(currencyId);

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
     * Caches the announcement in the entity cache if it is enabled.
     *
     * @param announcement the announcement
     */
    @Override
    public void cacheResult(Announcement announcement) {
        EntityCacheUtil.putResult(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementImpl.class, announcement.getPrimaryKey(), announcement);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
            new Object[] { announcement.getUuid(), announcement.getGroupId() },
            announcement);

        announcement.resetOriginalValues();
    }

    /**
     * Caches the announcements in the entity cache if it is enabled.
     *
     * @param announcements the announcements
     */
    @Override
    public void cacheResult(List<Announcement> announcements) {
        for (Announcement announcement : announcements) {
            if (EntityCacheUtil.getResult(
                        AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
                        AnnouncementImpl.class, announcement.getPrimaryKey()) == null) {
                cacheResult(announcement);
            } else {
                announcement.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all announcements.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(AnnouncementImpl.class.getName());
        }

        EntityCacheUtil.clearCache(AnnouncementImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the announcement.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Announcement announcement) {
        EntityCacheUtil.removeResult(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementImpl.class, announcement.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(announcement);
    }

    @Override
    public void clearCache(List<Announcement> announcements) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Announcement announcement : announcements) {
            EntityCacheUtil.removeResult(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
                AnnouncementImpl.class, announcement.getPrimaryKey());

            clearUniqueFindersCache(announcement);
        }
    }

    protected void cacheUniqueFindersCache(Announcement announcement) {
        if (announcement.isNew()) {
            Object[] args = new Object[] {
                    announcement.getUuid(), announcement.getGroupId()
                };

            FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                Long.valueOf(1));
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                announcement);
        } else {
            AnnouncementModelImpl announcementModelImpl = (AnnouncementModelImpl) announcement;

            if ((announcementModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        announcement.getUuid(), announcement.getGroupId()
                    };

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
                    Long.valueOf(1));
                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
                    announcement);
            }
        }
    }

    protected void clearUniqueFindersCache(Announcement announcement) {
        AnnouncementModelImpl announcementModelImpl = (AnnouncementModelImpl) announcement;

        Object[] args = new Object[] {
                announcement.getUuid(), announcement.getGroupId()
            };

        FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

        if ((announcementModelImpl.getColumnBitmask() &
                FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
            args = new Object[] {
                    announcementModelImpl.getOriginalUuid(),
                    announcementModelImpl.getOriginalGroupId()
                };

            FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
            FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
        }
    }

    /**
     * Creates a new announcement with the primary key. Does not add the announcement to the database.
     *
     * @param announcementId the primary key for the new announcement
     * @return the new announcement
     */
    @Override
    public Announcement create(long announcementId) {
        Announcement announcement = new AnnouncementImpl();

        announcement.setNew(true);
        announcement.setPrimaryKey(announcementId);

        String uuid = PortalUUIDUtil.generate();

        announcement.setUuid(uuid);

        return announcement;
    }

    /**
     * Removes the announcement with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param announcementId the primary key of the announcement
     * @return the announcement that was removed
     * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement remove(long announcementId)
        throws NoSuchAnnouncementException, SystemException {
        return remove((Serializable) announcementId);
    }

    /**
     * Removes the announcement with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the announcement
     * @return the announcement that was removed
     * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement remove(Serializable primaryKey)
        throws NoSuchAnnouncementException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Announcement announcement = (Announcement) session.get(AnnouncementImpl.class,
                    primaryKey);

            if (announcement == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchAnnouncementException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(announcement);
        } catch (NoSuchAnnouncementException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Announcement removeImpl(Announcement announcement)
        throws SystemException {
        announcement = toUnwrappedModel(announcement);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(announcement)) {
                announcement = (Announcement) session.get(AnnouncementImpl.class,
                        announcement.getPrimaryKeyObj());
            }

            if (announcement != null) {
                session.delete(announcement);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (announcement != null) {
            clearCache(announcement);
        }

        return announcement;
    }

    @Override
    public Announcement updateImpl(
        com.zenixia.plugins.hexiagon.model.Announcement announcement)
        throws SystemException {
        announcement = toUnwrappedModel(announcement);

        boolean isNew = announcement.isNew();

        AnnouncementModelImpl announcementModelImpl = (AnnouncementModelImpl) announcement;

        if (Validator.isNull(announcement.getUuid())) {
            String uuid = PortalUUIDUtil.generate();

            announcement.setUuid(uuid);
        }

        Session session = null;

        try {
            session = openSession();

            if (announcement.isNew()) {
                session.save(announcement);

                announcement.setNew(false);
            } else {
                session.merge(announcement);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !AnnouncementModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((announcementModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        announcementModelImpl.getOriginalUuid()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);

                args = new Object[] { announcementModelImpl.getUuid() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
                    args);
            }

            if ((announcementModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        announcementModelImpl.getOriginalUuid(),
                        announcementModelImpl.getOriginalCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);

                args = new Object[] {
                        announcementModelImpl.getUuid(),
                        announcementModelImpl.getCompanyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
                    args);
            }

            if ((announcementModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        announcementModelImpl.getOriginalGroupId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);

                args = new Object[] { announcementModelImpl.getGroupId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);
            }

            if ((announcementModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        announcementModelImpl.getOriginalGroupId(),
                        announcementModelImpl.getOriginalStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_S, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S,
                    args);

                args = new Object[] {
                        announcementModelImpl.getGroupId(),
                        announcementModelImpl.getStatus()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_S, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_S,
                    args);
            }

            if ((announcementModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPEID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        announcementModelImpl.getOriginalTypeId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TYPEID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPEID,
                    args);

                args = new Object[] { announcementModelImpl.getTypeId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TYPEID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPEID,
                    args);
            }

            if ((announcementModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CURRENCYID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        announcementModelImpl.getOriginalCurrencyId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CURRENCYID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CURRENCYID,
                    args);

                args = new Object[] { announcementModelImpl.getCurrencyId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CURRENCYID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CURRENCYID,
                    args);
            }
        }

        EntityCacheUtil.putResult(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
            AnnouncementImpl.class, announcement.getPrimaryKey(), announcement);

        clearUniqueFindersCache(announcement);
        cacheUniqueFindersCache(announcement);

        return announcement;
    }

    protected Announcement toUnwrappedModel(Announcement announcement) {
        if (announcement instanceof AnnouncementImpl) {
            return announcement;
        }

        AnnouncementImpl announcementImpl = new AnnouncementImpl();

        announcementImpl.setNew(announcement.isNew());
        announcementImpl.setPrimaryKey(announcement.getPrimaryKey());

        announcementImpl.setUuid(announcement.getUuid());
        announcementImpl.setAnnouncementId(announcement.getAnnouncementId());
        announcementImpl.setCompanyId(announcement.getCompanyId());
        announcementImpl.setGroupId(announcement.getGroupId());
        announcementImpl.setUserId(announcement.getUserId());
        announcementImpl.setTypeId(announcement.getTypeId());
        announcementImpl.setFolderId(announcement.getFolderId());
        announcementImpl.setUserName(announcement.getUserName());
        announcementImpl.setCreateDate(announcement.getCreateDate());
        announcementImpl.setModifiedDate(announcement.getModifiedDate());
        announcementImpl.setCurrencyId(announcement.getCurrencyId());
        announcementImpl.setTitle(announcement.getTitle());
        announcementImpl.setEmailAddress(announcement.getEmailAddress());
        announcementImpl.setPhoneNumber(announcement.getPhoneNumber());
        announcementImpl.setPrice(announcement.getPrice());
        announcementImpl.setContent(announcement.getContent());
        announcementImpl.setStatus(announcement.getStatus());
        announcementImpl.setStatusByUserId(announcement.getStatusByUserId());
        announcementImpl.setStatusByUserName(announcement.getStatusByUserName());
        announcementImpl.setStatusDate(announcement.getStatusDate());
        announcementImpl.setCountryId(announcement.getCountryId());
        announcementImpl.setRegionId(announcement.getRegionId());

        return announcementImpl;
    }

    /**
     * Returns the announcement with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the announcement
     * @return the announcement
     * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement findByPrimaryKey(Serializable primaryKey)
        throws NoSuchAnnouncementException, SystemException {
        Announcement announcement = fetchByPrimaryKey(primaryKey);

        if (announcement == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchAnnouncementException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return announcement;
    }

    /**
     * Returns the announcement with the primary key or throws a {@link com.zenixia.plugins.hexiagon.NoSuchAnnouncementException} if it could not be found.
     *
     * @param announcementId the primary key of the announcement
     * @return the announcement
     * @throws com.zenixia.plugins.hexiagon.NoSuchAnnouncementException if a announcement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement findByPrimaryKey(long announcementId)
        throws NoSuchAnnouncementException, SystemException {
        return findByPrimaryKey((Serializable) announcementId);
    }

    /**
     * Returns the announcement with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the announcement
     * @return the announcement, or <code>null</code> if a announcement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Announcement announcement = (Announcement) EntityCacheUtil.getResult(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
                AnnouncementImpl.class, primaryKey);

        if (announcement == _nullAnnouncement) {
            return null;
        }

        if (announcement == null) {
            Session session = null;

            try {
                session = openSession();

                announcement = (Announcement) session.get(AnnouncementImpl.class,
                        primaryKey);

                if (announcement != null) {
                    cacheResult(announcement);
                } else {
                    EntityCacheUtil.putResult(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
                        AnnouncementImpl.class, primaryKey, _nullAnnouncement);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(AnnouncementModelImpl.ENTITY_CACHE_ENABLED,
                    AnnouncementImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return announcement;
    }

    /**
     * Returns the announcement with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param announcementId the primary key of the announcement
     * @return the announcement, or <code>null</code> if a announcement with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Announcement fetchByPrimaryKey(long announcementId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) announcementId);
    }

    /**
     * Returns all the announcements.
     *
     * @return the announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Announcement> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the announcements.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of announcements
     * @param end the upper bound of the range of announcements (not inclusive)
     * @return the range of announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Announcement> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the announcements.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.AnnouncementModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of announcements
     * @param end the upper bound of the range of announcements (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of announcements
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Announcement> findAll(int start, int end,
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

        List<Announcement> list = (List<Announcement>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ANNOUNCEMENT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ANNOUNCEMENT;

                if (pagination) {
                    sql = sql.concat(AnnouncementModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Announcement>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Announcement>(list);
                } else {
                    list = (List<Announcement>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Removes all the announcements from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Announcement announcement : findAll()) {
            remove(announcement);
        }
    }

    /**
     * Returns the number of announcements.
     *
     * @return the number of announcements
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

                Query q = session.createQuery(_SQL_COUNT_ANNOUNCEMENT);

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
     * Initializes the announcement persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.zenixia.plugins.hexiagon.model.Announcement")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Announcement>> listenersList = new ArrayList<ModelListener<Announcement>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Announcement>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(AnnouncementImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
