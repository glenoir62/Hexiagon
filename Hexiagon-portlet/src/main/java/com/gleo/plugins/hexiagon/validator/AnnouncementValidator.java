
package com.gleo.plugins.hexiagon.validator;

import com.liferay.portal.kernel.util.Validator;
import com.gleo.plugins.hexiagon.model.Announcement;
import com.gleo.plugins.hexiagon.model.AnnouncementImage;

import java.util.List;
import java.util.Locale;

public class AnnouncementValidator {

	/**
	 * @param announcement
	 *            to be validated
	 * @param errors
	 *            to populate with any errors
	 * @return
	 */
	public static boolean validateAnnouncement(Announcement announcement, List<String> errors, Locale locale) {

		boolean valid = true;

		if (Validator.isNull(announcement)) {
			errors.add("announcement-errors");
			valid = false;
		}

		List<AnnouncementImage> announcementImages = announcement.getAnnouncementImages();

		if (Validator.isNotNull(announcementImages)) {
			// Image validation
			for (AnnouncementImage announcementImage : announcementImages) {
				valid = valid && AnnouncementImageValidator.validateAnnouncementImage(announcementImage, errors);
			}
		}

		if (Validator.isNull(announcement.getTitle(locale))) {
			errors.add("announcementtitle-required");
			valid = false;
		}

		if (announcement.getPrice() < 0 || !Validator.isNumber(String.valueOf(announcement.getPrice()))) {
			errors.add("announcementprice-required");
			valid = false;
		}

		if (Validator.isNull(announcement.getContent(locale))) {
			errors.add("announcementcontent-required");
			valid = false;
		}

		if (Validator.isNotNull(announcement.getEmailAddress()) && !Validator.isEmailAddress(announcement.getEmailAddress())) {
			errors.add("announcementemail-format-error");
			valid = false;
		}

		if (Validator.isNotNull(announcement.getPhoneNumber()) && !Validator.isPhoneNumber(announcement.getPhoneNumber())) {
			errors.add("announcementphonenumber-format-error");
			valid = false;
		}

		if (Validator.isNull(announcement.getTypeId())) {
			errors.add("announcementtype-required");
			valid = false;
		}
		
		if (!announcement.isValidAgreement()) {
			errors.add("announcementagreement-required");
			valid = false;
		}

		return valid;
	}
}
