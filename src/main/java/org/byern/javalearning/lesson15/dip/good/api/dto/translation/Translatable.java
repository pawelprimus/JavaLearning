package org.byern.javalearning.lesson15.dip.good.api.dto.translation;

import java.util.List;

/**
 * Created by krzyspo on 10/06/2017.
 */
public interface Translatable {

    List<TranslatableItem> getItemsToTranslate();
}
