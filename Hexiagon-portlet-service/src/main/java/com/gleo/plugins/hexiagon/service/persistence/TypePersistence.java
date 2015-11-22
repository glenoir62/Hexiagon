package com.gleo.plugins.hexiagon.service.persistence;

import com.gleo.plugins.hexiagon.model.Type;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author guillaumelenoir
 * @see TypePersistenceImpl
 * @see TypeUtil
 * @generated
 */
public interface TypePersistence extends BasePersistence<Type> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link TypeUtil} to access the type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the types where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching types
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.gleo.plugins.hexiagon.model.Type> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the types where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.TypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of types
    * @param end the upper bound of the range of types (not inclusive)
    * @return the range of matching types
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.gleo.plugins.hexiagon.model.Type> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the types where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.TypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of types
    * @param end the upper bound of the range of types (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching types
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.gleo.plugins.hexiagon.model.Type> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first type in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching type
    * @throws com.gleo.plugins.hexiagon.NoSuchTypeException if a matching type could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.Type findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchTypeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first type in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching type, or <code>null</code> if a matching type could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.Type fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last type in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching type
    * @throws com.gleo.plugins.hexiagon.NoSuchTypeException if a matching type could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.Type findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchTypeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last type in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching type, or <code>null</code> if a matching type could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.Type fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the types before and after the current type in the ordered set where groupId = &#63;.
    *
    * @param typeId the primary key of the current type
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next type
    * @throws com.gleo.plugins.hexiagon.NoSuchTypeException if a type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.Type[] findByGroupId_PrevAndNext(
        long typeId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchTypeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the types that the user has permission to view where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching types that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.gleo.plugins.hexiagon.model.Type> filterFindByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the types that the user has permission to view where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.TypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of types
    * @param end the upper bound of the range of types (not inclusive)
    * @return the range of matching types that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.gleo.plugins.hexiagon.model.Type> filterFindByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the types that the user has permissions to view where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.TypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of types
    * @param end the upper bound of the range of types (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching types that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.gleo.plugins.hexiagon.model.Type> filterFindByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the types before and after the current type in the ordered set of types that the user has permission to view where groupId = &#63;.
    *
    * @param typeId the primary key of the current type
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next type
    * @throws com.gleo.plugins.hexiagon.NoSuchTypeException if a type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.Type[] filterFindByGroupId_PrevAndNext(
        long typeId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.gleo.plugins.hexiagon.NoSuchTypeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the types where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of types where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching types
    * @throws SystemException if a system exception occurred
    */
    public int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of types that the user has permission to view where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching types that the user has permission to view
    * @throws SystemException if a system exception occurred
    */
    public int filterCountByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the type in the entity cache if it is enabled.
    *
    * @param type the type
    */
    public void cacheResult(com.gleo.plugins.hexiagon.model.Type type);

    /**
    * Caches the types in the entity cache if it is enabled.
    *
    * @param types the types
    */
    public void cacheResult(
        java.util.List<com.gleo.plugins.hexiagon.model.Type> types);

    /**
    * Creates a new type with the primary key. Does not add the type to the database.
    *
    * @param typeId the primary key for the new type
    * @return the new type
    */
    public com.gleo.plugins.hexiagon.model.Type create(long typeId);

    /**
    * Removes the type with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param typeId the primary key of the type
    * @return the type that was removed
    * @throws com.gleo.plugins.hexiagon.NoSuchTypeException if a type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.Type remove(long typeId)
        throws com.gleo.plugins.hexiagon.NoSuchTypeException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.gleo.plugins.hexiagon.model.Type updateImpl(
        com.gleo.plugins.hexiagon.model.Type type)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the type with the primary key or throws a {@link com.gleo.plugins.hexiagon.NoSuchTypeException} if it could not be found.
    *
    * @param typeId the primary key of the type
    * @return the type
    * @throws com.gleo.plugins.hexiagon.NoSuchTypeException if a type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.Type findByPrimaryKey(long typeId)
        throws com.gleo.plugins.hexiagon.NoSuchTypeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the type with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param typeId the primary key of the type
    * @return the type, or <code>null</code> if a type with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.gleo.plugins.hexiagon.model.Type fetchByPrimaryKey(long typeId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the types.
    *
    * @return the types
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.gleo.plugins.hexiagon.model.Type> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the types.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.TypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of types
    * @param end the upper bound of the range of types (not inclusive)
    * @return the range of types
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.gleo.plugins.hexiagon.model.Type> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the types.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.gleo.plugins.hexiagon.model.impl.TypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of types
    * @param end the upper bound of the range of types (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of types
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.gleo.plugins.hexiagon.model.Type> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the types from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of types.
    *
    * @return the number of types
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
