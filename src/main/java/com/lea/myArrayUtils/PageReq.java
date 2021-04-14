package com.lea.myArrayUtils;

import java.io.Serializable;
import java.util.List;

public class PageReq implements Serializable {
    private static final long serialVersionUID = -281823435453324234L;

    private List<String> sceneIds;

    public List<String> getSceneIds() {
        return sceneIds;
    }

    public void setSceneIds(List<String> sceneIds) {
        this.sceneIds = sceneIds;
    }
}
