package com.entity.model;

import com.entity.XiaoshuoCollectionEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 书架
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XiaoshuoCollectionModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 小说
     */
    private Integer xiaoshuoId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 类型
     */
    private Integer xiaoshuoCollectionTypes;


    /**
     * 加入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：小说
	 */
    public Integer getXiaoshuoId() {
        return xiaoshuoId;
    }


    /**
	 * 设置：小说
	 */
    public void setXiaoshuoId(Integer xiaoshuoId) {
        this.xiaoshuoId = xiaoshuoId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：类型
	 */
    public Integer getXiaoshuoCollectionTypes() {
        return xiaoshuoCollectionTypes;
    }


    /**
	 * 设置：类型
	 */
    public void setXiaoshuoCollectionTypes(Integer xiaoshuoCollectionTypes) {
        this.xiaoshuoCollectionTypes = xiaoshuoCollectionTypes;
    }
    /**
	 * 获取：加入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：加入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
