package org.byern.javalearning.lesson15.dip.bad.service.messaging;

import org.byern.javalearning.lesson15.dip.bad.api.dto.Message;

/**
 * Created by krzyspo on 10/06/2017.
 */
public interface FooterableMessagingService extends MessagingServiceFunctionality {

    void addFooter(Message message);

}
