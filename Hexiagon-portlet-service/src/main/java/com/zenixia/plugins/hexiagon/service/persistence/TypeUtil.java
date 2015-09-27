package com.zenixia.plugins.hexiagon.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.zenixia.plugins.hexiagon.model.Type;

import java.util.List;

/**
 * The persistence utility for the type service. This utility wraps {@link TypePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author guillaumelenoir
 * @see TypePersistence
 * @see TypePersistenceImpl
 * @generated
 */
public class TypeUtil {
    private static TypePersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Type type) {
        getPersistence().clearCache(type);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Type> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Type> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Type> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Type update(Type type) throws SystemException {
        return getPersistence().update(type);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Type update(Type type, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(type, serviceContext);
    }

    /**
    * Returns all the types where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching types
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.zenixia.plugins.hexiagon.model.Type> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId);
    }

    /**
    * Returns a range of all the types where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.TypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of types
    * @param end the upper bound of the range of types (not inclusive)
    * @return the range of matching types
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.zenixia.plugins.hexiagon.model.Type> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId, start, end);
    }

    /**
    * Returns an ordered range of all the types where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.TypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of types
    * @param end the upper bound of the range of types (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching types
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.zenixia.plugins.hexiagon.model.Type> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByGroupId(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the first type in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching type
    * @throws com.zenixia.plugins.hexiagon.NoSuchTypeException if a matching type could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.zenixia.plugins.hexiagon.model.Type findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchTypeException {
        return getPersistence().findByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the first type in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching type, or <code>null</code> if a matching type could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.zenixia.plugins.hexiagon.model.Type fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the last type in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching type
    * @throws com.zenixia.plugins.hexiagon.NoSuchTypeException if a matching type could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.zenixia.plugins.hexiagon.model.Type findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchTypeException {
        return getPersistence().findByGroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the last type in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching type, or <code>null</code> if a matching type could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.zenixia.plugins.hexiagon.model.Type fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the types before and after the current type in the ordered set where groupId = &#63;.
    *
    * @param typeId the primary key of the current type
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next type
    * @throws com.zenixia.plugins.hexiagon.NoSuchTypeException if a type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.zenixia.plugins.hexiagon.model.Type[] findByGroupId_PrevAndNext(
        long typeId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchTypeException {
        return getPersistence()
                   .findByGroupId_PrevAndNext(typeId, groupId, orderByComparator);
    }

    /**
    * Returns all the types that the user has permission to view where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching types that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.zenixia.plugins.hexiagon.model.Type> filterFindByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().filterFindByGroupId(groupId);
    }

    /**
    * Returns a range of all the types that the user has permission to view where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.TypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of types
    * @param end the upper bound of the range of types (not inclusive)
    * @return the range of matching types that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.zenixia.plugins.hexiagon.model.Type> filterFindByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().filterFindByGroupId(groupId, start, end);
    }

    /**
    * Returns an ordered range of all the types that the user has permissions to view where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.TypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of types
    * @param end the upper bound of the range of types (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching types that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.zenixia.plugins.hexiagon.model.Type> filterFindByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .filterFindByGroupId(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the types before and after the current type in the ordered set of types that the user has permission to view where groupId = &#63;.
    *
    * @param typeId the primary key of the current type
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next type
    * @throws com.zenixia.plugins.hexiagon.NoSuchTypeException if a type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.zenixia.plugins.hexiagon.model.Type[] filterFindByGroupId_PrevAndNext(
        long typeId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchTypeException {
        return getPersistence()
                   .filterFindByGroupId_PrevAndNext(typeId, groupId,
            orderByComparator);
    }

    /**
    * Removes all the types where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByGroupId(groupId);
    }

    /**
    * Returns the number of types where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching types
    * @throws SystemException if a system exception occurred
    */
    public static int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByGroupId(groupId);
    }

    /**
    * Returns the number of types that the user has permission to view where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching types that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public static int filterCountByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().filterCountByGroupId(groupId);
    }

    /**
    * Caches the type in the entity cache if it is enabled.
    *
    * @param type the type
    */
    public static void cacheResult(com.zenixia.plugins.hexiagon.model.Type type) {
        getPersistence().cacheResult(type);
    }

    /**
    * Caches the types in the entity cache if it is enabled.
    *
    * @param types the types
    */
    public static void cacheResult(
        java.util.List<com.zenixia.plugins.hexiagon.model.Type> types) {
        getPersistence().cacheResult(types);
    }

    /**
    * Creates a new type with the primary key. Does not add the type to the database.
    *
    * @param typeId the primary key for the new type
    * @return the new type
    */
    public static com.zenixia.plugins.hexiagon.model.Type create(long typeId) {
        return getPersistence().create(typeId);
    }

    /**
    * Removes the type with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param typeId the primary key of the type
    * @return the type that was removed
    * @throws com.zenixia.plugins.hexiagon.NoSuchTypeException if a type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.zenixia.plugins.hexiagon.model.Type remove(long typeId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchTypeException {
        return getPersistence().remove(typeId);
    }

    public static com.zenixia.plugins.hexiagon.model.Type updateImpl(
        com.zenixia.plugins.hexiagon.model.Type type)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(type);
    }

    /**
    * Returns the type with the primary key or throws a {@link com.zenixia.plugins.hexiagon.NoSuchTypeException} if it could not be found.
    *
    * @param typeId the primary key of the type
    * @return the type
    * @throws com.zenixia.plugins.hexiagon.NoSuchTypeException if a type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.zenixia.plugins.hexiagon.model.Type findByPrimaryKey(
        long typeId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.zenixia.plugins.hexiagon.NoSuchTypeException {
        return getPersistence().findByPrimaryKey(typeId);
    }

    /**
    * Returns the type with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param typeId the primary key of the type
    * @return the type, or <code>null</code> if a type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.zenixia.plugins.hexiagon.model.Type fetchByPrimaryKey(
        long typeId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(typeId);
    }

    /**
    * Returns all the types.
    *
    * @return the types
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.zenixia.plugins.hexiagon.model.Type> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the types.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.TypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of types
    * @param end the upper bound of the range of types (not inclusive)
    * @return the range of types
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.zenixia.plugins.hexiagon.model.Type> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the types.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.zenixia.plugins.hexiagon.model.impl.TypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of types
    * @param end the upper bound of the range of types (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of types
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.zenixia.plugins.hexiagon.model.Type> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the types from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of types.
    *
    * @return the number of types
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static TypePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (TypePersistence) PortletBeanLocatorUtil.locate(com.zenixia.plugins.hexiagon.service.ClpSerializer.getServletContextName(),
                    TypePersistence.class.getName());

            ReferenceRegistry.registerReference(TypeUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(TypePersistence persistence) {
    }
}
