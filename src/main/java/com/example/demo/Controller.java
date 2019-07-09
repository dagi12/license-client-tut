package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;
import java.util.TimeZone;

/**
 * Stworzone przez Eryk Mariankowski dnia 28.06.2019.
 */
@RestController
public class Controller {

    private static final Logger LOGGER = LoggerFactory.getLogger(Controller.class);

    @GetMapping(value = "/locale")
    public TomcatInto asd() {
        TimeZone aDefault = TimeZone.getDefault();
        LOGGER.info(aDefault.toString());
        return new TomcatInto(LocaleContextHolder.getLocale(), aDefault);
    }

    public class TomcatInto {
        Locale locale;
        TimeZone timeZone;

        TomcatInto(Locale locale, TimeZone aDefault) {
            this.locale = locale;
            this.timeZone = aDefault;
        }
    }

}
