package xyz.aungpyaephyo.padc.myanmarattractions.events;

import java.util.List;

import xyz.aungpyaephyo.padc.myanmarattractions.data.vos.AttractionVO;

/**
 * Created by winthanhtike on 7/9/16.
 */
public class DataEvent {

    public static class AttractionDataLoadedEvent {

        private String extraMessage;
        private List<AttractionVO> attractionVOs;

        public AttractionDataLoadedEvent(String extraMessage, List<AttractionVO> attractionVOs) {
            this.extraMessage = extraMessage;
            this.attractionVOs = attractionVOs;
        }

        public AttractionDataLoadedEvent(String extraMessage) {
            this.extraMessage = extraMessage;
        }

        public String getExtraMessage() {
            return extraMessage;
        }

        public List<AttractionVO> getAttractionVOs() {
            return attractionVOs;
        }
    }

}
