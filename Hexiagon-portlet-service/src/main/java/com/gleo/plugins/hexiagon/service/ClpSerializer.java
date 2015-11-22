package com.gleo.plugins.hexiagon.service;

import com.gleo.plugins.hexiagon.model.AnnouncementClp;
import com.gleo.plugins.hexiagon.model.AnnouncementImageClp;
import com.gleo.plugins.hexiagon.model.CurrencyClp;
import com.gleo.plugins.hexiagon.model.FavoriteClp;
import com.gleo.plugins.hexiagon.model.TypeClp;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;


public class ClpSerializer {
    private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
    private static String _servletContextName;
    private static boolean _useReflectionToTranslateThrowable = true;

    public static String getServletContextName() {
        if (Validator.isNotNull(_servletContextName)) {
            return _servletContextName;
        }

        synchronized (ClpSerializer.class) {
            if (Validator.isNotNull(_servletContextName)) {
                return _servletContextName;
            }

            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Class<?> portletPropsClass = classLoader.loadClass(
                        "com.liferay.util.portlet.PortletProps");

                Method getMethod = portletPropsClass.getMethod("get",
                        new Class<?>[] { String.class });

                String portletPropsServletContextName = (String) getMethod.invoke(null,
                        "Hexiagon-portlet-deployment-context");

                if (Validator.isNotNull(portletPropsServletContextName)) {
                    _servletContextName = portletPropsServletContextName;
                }
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info(
                        "Unable to locate deployment context from portlet properties");
                }
            }

            if (Validator.isNull(_servletContextName)) {
                try {
                    String propsUtilServletContextName = PropsUtil.get(
                            "Hexiagon-portlet-deployment-context");

                    if (Validator.isNotNull(propsUtilServletContextName)) {
                        _servletContextName = propsUtilServletContextName;
                    }
                } catch (Throwable t) {
                    if (_log.isInfoEnabled()) {
                        _log.info(
                            "Unable to locate deployment context from portal properties");
                    }
                }
            }

            if (Validator.isNull(_servletContextName)) {
                _servletContextName = "Hexiagon-portlet";
            }

            return _servletContextName;
        }
    }

    public static Object translateInput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals(AnnouncementClp.class.getName())) {
            return translateInputAnnouncement(oldModel);
        }

        if (oldModelClassName.equals(AnnouncementImageClp.class.getName())) {
            return translateInputAnnouncementImage(oldModel);
        }

        if (oldModelClassName.equals(CurrencyClp.class.getName())) {
            return translateInputCurrency(oldModel);
        }

        if (oldModelClassName.equals(FavoriteClp.class.getName())) {
            return translateInputFavorite(oldModel);
        }

        if (oldModelClassName.equals(TypeClp.class.getName())) {
            return translateInputType(oldModel);
        }

        return oldModel;
    }

    public static Object translateInput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateInput(curObj));
        }

        return newList;
    }

    public static Object translateInputAnnouncement(BaseModel<?> oldModel) {
        AnnouncementClp oldClpModel = (AnnouncementClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getAnnouncementRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputAnnouncementImage(BaseModel<?> oldModel) {
        AnnouncementImageClp oldClpModel = (AnnouncementImageClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getAnnouncementImageRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputCurrency(BaseModel<?> oldModel) {
        CurrencyClp oldClpModel = (CurrencyClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getCurrencyRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputFavorite(BaseModel<?> oldModel) {
        FavoriteClp oldClpModel = (FavoriteClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getFavoriteRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputType(BaseModel<?> oldModel) {
        TypeClp oldClpModel = (TypeClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getTypeRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateInput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateInput((List<Object>) obj);
        } else {
            return obj;
        }
    }

    public static Object translateOutput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals(
                    "com.gleo.plugins.hexiagon.model.impl.AnnouncementImpl")) {
            return translateOutputAnnouncement(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.gleo.plugins.hexiagon.model.impl.AnnouncementImageImpl")) {
            return translateOutputAnnouncementImage(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.gleo.plugins.hexiagon.model.impl.CurrencyImpl")) {
            return translateOutputCurrency(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.gleo.plugins.hexiagon.model.impl.FavoriteImpl")) {
            return translateOutputFavorite(oldModel);
        }

        if (oldModelClassName.equals(
                    "com.gleo.plugins.hexiagon.model.impl.TypeImpl")) {
            return translateOutputType(oldModel);
        }

        return oldModel;
    }

    public static Object translateOutput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateOutput(curObj));
        }

        return newList;
    }

    public static Object translateOutput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateOutput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateOutput((List<Object>) obj);
        } else {
            return obj;
        }
    }

    public static Throwable translateThrowable(Throwable throwable) {
        if (_useReflectionToTranslateThrowable) {
            try {
                UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

                objectOutputStream.writeObject(throwable);

                objectOutputStream.flush();
                objectOutputStream.close();

                UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
                        0, unsyncByteArrayOutputStream.size());

                Thread currentThread = Thread.currentThread();

                ClassLoader contextClassLoader = currentThread.getContextClassLoader();

                ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
                        contextClassLoader);

                throwable = (Throwable) objectInputStream.readObject();

                objectInputStream.close();

                return throwable;
            } catch (SecurityException se) {
                if (_log.isInfoEnabled()) {
                    _log.info("Do not use reflection to translate throwable");
                }

                _useReflectionToTranslateThrowable = false;
            } catch (Throwable throwable2) {
                _log.error(throwable2, throwable2);

                return throwable2;
            }
        }

        Class<?> clazz = throwable.getClass();

        String className = clazz.getName();

        if (className.equals(PortalException.class.getName())) {
            return new PortalException();
        }

        if (className.equals(SystemException.class.getName())) {
            return new SystemException();
        }

        if (className.equals("com.gleo.plugins.hexiagon.ImageSizeException")) {
            return new com.gleo.plugins.hexiagon.ImageSizeException();
        }

        if (className.equals(
                    "com.gleo.plugins.hexiagon.NoSuchAnnouncementException")) {
            return new com.gleo.plugins.hexiagon.NoSuchAnnouncementException();
        }

        if (className.equals(
                    "com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException")) {
            return new com.gleo.plugins.hexiagon.NoSuchAnnouncementImageException();
        }

        if (className.equals(
                    "com.gleo.plugins.hexiagon.NoSuchCurrencyException")) {
            return new com.gleo.plugins.hexiagon.NoSuchCurrencyException();
        }

        if (className.equals(
                    "com.gleo.plugins.hexiagon.NoSuchFavoriteException")) {
            return new com.gleo.plugins.hexiagon.NoSuchFavoriteException();
        }

        if (className.equals("com.gleo.plugins.hexiagon.NoSuchTypeException")) {
            return new com.gleo.plugins.hexiagon.NoSuchTypeException();
        }

        return throwable;
    }

    public static Object translateOutputAnnouncement(BaseModel<?> oldModel) {
        AnnouncementClp newModel = new AnnouncementClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setAnnouncementRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputAnnouncementImage(BaseModel<?> oldModel) {
        AnnouncementImageClp newModel = new AnnouncementImageClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setAnnouncementImageRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputCurrency(BaseModel<?> oldModel) {
        CurrencyClp newModel = new CurrencyClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setCurrencyRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputFavorite(BaseModel<?> oldModel) {
        FavoriteClp newModel = new FavoriteClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setFavoriteRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputType(BaseModel<?> oldModel) {
        TypeClp newModel = new TypeClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setTypeRemoteModel(oldModel);

        return newModel;
    }
}
