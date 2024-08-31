package com.shuai.yuapicommon.model.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.shuai.yuapicommon.model.entity.Post;

/**
 * 帖子视图
 *
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PostVO extends Post {

    /**
     * 是否已点赞
     */
    private Boolean hasThumb;

    private static final long serialVersionUID = 1L;
}