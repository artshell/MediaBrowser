package com.ckr.mediabrowser.model.video;

import com.ckr.mediabrowser.model.MediaItem;

/**
 * Created by PC大佬 on 2018/5/19.
 */

public class Video extends MediaItem {
	public Video(String path, long size, String displayName, String title, String dateAdded, String dateModified, String mimeType, Long id) {
		super(path, size, displayName, title, dateAdded, dateModified, mimeType, id);
	}

	@Override
	public int getMediaType() {
		return MEDIA_TYPE_VIDEO;
	}
}
