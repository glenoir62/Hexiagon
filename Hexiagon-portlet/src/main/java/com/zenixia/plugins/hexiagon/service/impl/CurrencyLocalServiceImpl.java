package com.zenixia.plugins.hexiagon.service.impl;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;
import com.zenixia.plugins.hexiagon.model.Currency;
import com.zenixia.plugins.hexiagon.service.base.CurrencyLocalServiceBaseImpl;

/**
 * The implementation of the currency local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.liferay.plugin.announcement.service.CurrencyLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author guillaumelenoir
 * @see org.liferay.plugin.announcement.service.base.CurrencyLocalServiceBaseImpl
 * @see org.liferay.plugin.announcement.service.CurrencyLocalServiceUtil
 */
public class CurrencyLocalServiceImpl extends CurrencyLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link org.liferay.plugin.announcement.service.CurrencyLocalServiceUtil} to access the currency local service.
     */
	
	/**
	 * Adds the currency to the database incrementing the primary key
	 * @throws PortalException 
	 *
	 */
	public Currency addCurrency(Currency currency, ServiceContext serviceContext) throws SystemException, PortalException {
		long companyId = serviceContext.getCompanyId();
		long groupId = serviceContext.getScopeGroupId();
		long currencyId = CounterLocalServiceUtil.increment(Currency.class.getName());
		long userId = serviceContext.getUserId();

		currency.setCompanyId(companyId);
		currency.setCurrencyId(currencyId);
		currency = currencyPersistence.update(currency);
		
		// Resources
		if (serviceContext.isAddGroupPermissions() ||
			serviceContext.isAddGuestPermissions()) {

			resourceLocalService.addResources(
				currency.getCompanyId(), groupId, userId,
				Currency.class.getName(), currencyId, false,
				serviceContext.isAddGroupPermissions(), serviceContext.isAddGuestPermissions());
		}
		else {
			resourceLocalService.addModelResources(
				currency.getCompanyId(), groupId, userId,
				Currency.class.getName(), currencyId, serviceContext.getGroupPermissions(),
				serviceContext.getGuestPermissions());
		}
		

		return currency;
	}

	/**
	 * Delete the currency to the database
	 *
	 */
//	public Currency deleteCurrency(Currency currency) throws SystemException, PortalException {
//
//		if (Validator.isNotNull(currency)) {
//			long currencyId = currency.getCurrencyId();
//			if (announcementLocalService.getAnnouncementsCountByCurrencyId(currencyId) == 0) {
//				currency = super.deleteCurrency(currency);
//				resourceLocalService.deleteResource(currency.getCompanyId(), Currency.class.getName(), ResourceConstants.SCOPE_COMPANY, currency.getPrimaryKey());
//			} else {
//				throw new SystemException("use-currency");
//			}
//		}
//		return currency;
//	}
	
	/**
	 * Delete the currency to the database
	 *
	 */
	public Currency deleteCurrency(long currencyId) throws SystemException, PortalException {
		Currency currency = currencyLocalService.getCurrency(currencyId);
		return deleteCurrency(currency);
	}

	public Currency updateCurrency(Currency currency)
		throws SystemException {

		currencyPersistence.clearCache(currency);
		return super.updateCurrency(currency);
	}

}
