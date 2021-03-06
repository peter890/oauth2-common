package org.core.common.utils;


import org.core.common.enums.CookiesName;
import org.core.common.exceptions.CookieNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Manager ciasteczek.
 */
public class CookieManager {
    private final static Logger logger = LoggerFactory.getLogger(CookieManager.class);

    public static Cookie getCookie(final Cookie[] cookies, final String cookieName) throws CookieNotFoundException {
        if (cookies != null && cookies.length > 0 && cookieName != null
                && (cookieName == null ? "" != null : !cookieName.equals(""))) {
            for (final Cookie cookie : cookies) {
                if (cookieName.equals(cookie.getName())) {
                    return cookie;
                }
            }
        }
        throw new CookieNotFoundException(cookieName);
    }

    /**
     * @param request - HttpServletRequest
     * @param name    - nazwa ciasteczka
     * @return <b>Ciasteczko</b> albo <b>null</b> jeśli nie znaleziono.
     * @throws CookieNotFoundException
     */
    public static Cookie getCookie(final HttpServletRequest request, final CookiesName name) throws CookieNotFoundException {
        final String cookieName = name.getValue();
        final Cookie[] cookies = request.getCookies();
        return getCookie(cookies, cookieName);
    }

    /**
     * Ustawia ciasteczko.
     *
     * @param response    - HttpServletResponse
     * @param name        - Nazwa ciasteczka
     * @param cookieValue - Wartość ciasteczka
     */
    public static void setCookie(final HttpServletResponse response, final CookiesName name, final String cookieValue) {
        setCookie(response, name, cookieValue, false);
    }

    /**
     * Ustawia ciasteczko.
     *
     * @param response    - HttpServletResponse
     * @param name        - Nazwa ciasteczka
     * @param cookieValue - Wartość ciasteczka
     * @param isHttpOnly  - Flaga HttpOnly
     */
    public static void setCookie(final HttpServletResponse response, final CookiesName name, final String cookieValue, final boolean isHttpOnly) {
        final Cookie cookie = new Cookie(name.getValue(), cookieValue);
        cookie.setHttpOnly(isHttpOnly);
        response.addCookie(cookie);
    }

    /**
     * Ustawia ciasteczko.
     *
     * @param response - HttpServletResponse
     * @param cookie   - Ciasteczko do ustawienia
     */
    public static void setCookie(final HttpServletResponse response, final Cookie cookie) {
        response.addCookie(cookie);
    }

    /**
     * Usuwa ciasteczko.
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     * @param name     CookiesName
     */
    public static void removeCookie(final HttpServletRequest request, final HttpServletResponse response, final CookiesName name) {
        try {
            final Cookie cookie = getCookie(request, name);
            cookie.setMaxAge(0);
            cookie.setValue("");
            //cookie.setPath("/");
            response.addCookie(cookie);
        } catch (final CookieNotFoundException e) {
            logger.warn("Nie odnaleziono ciasteczka : " + name.getValue());
        }
    }
}
