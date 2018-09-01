package com.muiboot.shiro.system.domain;

import com.muiboot.shiro.common.annotation.ExportConfig;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * Created by 75631 on 2018/8/29.
 */
@Table(name = "M_DIC")
public class CoreDic implements Serializable {
    @Id
    @GeneratedValue(generator = "JDBC")
    @Column(name = "DIC_ID")
    private Long dicId;
    @Column(name = "PARENT_ID")
    private Long parentId=0L;
    @Column(name = "DIC_KEY")
    @ExportConfig(value = "字典编号")
    private String dicKey;
    @Column(name = "DIC_NAME")
    @ExportConfig(value = "字典名称")
    private String dicName;
    @Column(name = "DIC_TYPE")
    @ExportConfig(value = "字典类型")
    private String dicType;
    @Column(name = "SHOW_ICON")
    @ExportConfig(value = "是否显示图标")
    private Integer showIcon=0;
    @Column(name = "VALID")
    @ExportConfig(value = "是否有效")
    private Integer valid=0;
    @Column(name = "CONTENT")
    @ExportConfig(value = "字典内容")
    private String content;
    @Column(name = "SQL_CONTENT")
    @ExportConfig(value = "字典SQL")
    private String sqlContent;
    @Column(name = "VERSION")
    @ExportConfig(value = "字典版本")
    private String version;

    @Column(name = "ORDER_NUM")
    private Integer orderNum;
    @Column(name = "CREATE_DATE")
    @ExportConfig(value = "创建时间")
    private Date createDate;
    @Column(name = "UPDATE_DATE")
    @ExportConfig(value = "更新时间")
    private Date updateDate;

    public Long getDicId() {
        return dicId;
    }

    public void setDicId(Long dicId) {
        this.dicId = dicId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getDicKey() {
        return dicKey;
    }

    public void setDicKey(String dicKey) {
        this.dicKey = dicKey;
    }

    public String getDicName() {
        return dicName;
    }

    public void setDicName(String dicName) {
        this.dicName = dicName;
    }

    public String getDicType() {
        return dicType;
    }

    public void setDicType(String dicType) {
        this.dicType = dicType;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    public Integer getShowIcon() {
        return showIcon;
    }

    public void setShowIcon(Integer showIcon) {
        this.showIcon = showIcon;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSqlContent() {
        return sqlContent;
    }

    public void setSqlContent(String sqlContent) {
        this.sqlContent = sqlContent;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof CoreDic)) {
            return false;
        }
        CoreDic dic = (CoreDic) o;
        return
                Objects.equals(dicId, dic.dicId) &&
                Objects.equals(dicKey,dic.dicKey)&&
                Objects.equals(dicName,dic.dicName)&&
                Objects.equals(dicType,dic.dicType)&&
                Objects.equals(parentId,dic.parentId)&&
                Objects.equals(content,dic.content)&&
                Objects.equals(valid,dic.valid)&&
                Objects.equals(sqlContent,dic.sqlContent)&&
                Objects.equals(orderNum,dic.orderNum)&&
                Objects.equals(showIcon,dic.showIcon);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dicId, dicKey, dicName,dicType,parentId,content,valid,sqlContent,orderNum,showIcon);
    }

}
