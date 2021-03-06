
package com.gleo.plugins.hexiagon.validator;

import com.liferay.portal.kernel.io.ByteArrayFileInputStream;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.gleo.plugins.hexiagon.constants.AnnouncementConstants;
import com.gleo.plugins.hexiagon.model.AnnouncementImage;
import com.gleo.plugins.hexiagon.util.AnnouncementImageUtil;

import java.io.File;
import java.io.InputStream;
import java.util.List;

public class AnnouncementImageValidator {

	/**
	 * @param image
	 *            to be validated
	 * @param errors
	 *            to populate with any errors
	 * @return
	 */
	public static boolean validateAnnouncementImage(AnnouncementImage announcementImage, List<String> errors) {

		boolean valid = true;

		InputStream inputStream = announcementImage.getInputStream();
		String extensionsImages = AnnouncementConstants.IMAGE_EXTENSIONS;
		ByteArrayFileInputStream byteFileInputStream = (ByteArrayFileInputStream) inputStream;

		// validate inputStream
		if (Validator.isNotNull(byteFileInputStream) && Validator.isNotNull(byteFileInputStream.getFile())) {
			File file = byteFileInputStream.getFile();
			String extension = AnnouncementImageUtil.getExtension(file);

			// Verify image size
			if (file.length() > AnnouncementConstants.IMAGE_MAX_SIZE) {
				errors.add("image-size-error" + announcementImage.getOrder());
				valid = false;
			}

			// Verify extension
			if (extension != null && !StringUtil.contains(extensionsImages, extension)) {
				errors.add("image-extension-error" + announcementImage.getOrder());
				valid = false;
			}
		}

		return valid;
	}
}
