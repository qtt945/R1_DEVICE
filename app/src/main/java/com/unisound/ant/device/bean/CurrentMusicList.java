package com.unisound.ant.device.bean;

import java.util.List;
import nluparser.scheme.MusicResult;

public class CurrentMusicList {
    private ControlInfo controlInfo;
    private String detailInfo;
    private int status;

    public ControlInfo getControlInfo() {
        return this.controlInfo;
    }

    public void setControlInfo(ControlInfo controlInfo2) {
        this.controlInfo = controlInfo2;
    }

    public String getDetailInfo() {
        return this.detailInfo;
    }

    public void setDetailInfo(String detailInfo2) {
        this.detailInfo = detailInfo2;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status2) {
        this.status = status2;
    }

    public static class ControlInfo {
        private int pageCount;
        private List<MusicResult.Music> result;

        public int getPageCount() {
            return this.pageCount;
        }

        public void setPageCount(int pageCount2) {
            this.pageCount = pageCount2;
        }

        public List<MusicResult.Music> getResult() {
            return this.result;
        }

        public void setResult(List<MusicResult.Music> result2) {
            this.result = result2;
        }
    }
}
