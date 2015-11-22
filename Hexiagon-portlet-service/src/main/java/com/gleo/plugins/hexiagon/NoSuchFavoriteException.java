/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.gleo.plugins.hexiagon;

import com.liferay.portal.NoSuchModelException;

/**
 * @author guillaumelenoir
 */
public class NoSuchFavoriteException extends NoSuchModelException {

	public NoSuchFavoriteException() {
		super();
	}

	public NoSuchFavoriteException(String msg) {
		super(msg);
	}

	public NoSuchFavoriteException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchFavoriteException(Throwable cause) {
		super(cause);
	}

}