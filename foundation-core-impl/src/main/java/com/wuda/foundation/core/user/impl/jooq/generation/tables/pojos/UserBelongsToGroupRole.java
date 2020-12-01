/*
 * This file is generated by jOOQ.
 */
package com.wuda.foundation.core.user.impl.jooq.generation.tables.pojos;


import org.jooq.types.ULong;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 用户在所属的组中的角色
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserBelongsToGroupRole implements Serializable {

    private static final long serialVersionUID = -35788613;

    private ULong         userBelongsToGroupRoleId;
    private ULong         userBelongsToGroupId;
    private ULong         permissionRoleId;
    private LocalDateTime createTime;
    private ULong         createUserId;
    private LocalDateTime lastModifyTime;
    private ULong         lastModifyUserId;
    private ULong         isDeleted;

    public UserBelongsToGroupRole() {}

    public UserBelongsToGroupRole(UserBelongsToGroupRole value) {
        this.userBelongsToGroupRoleId = value.userBelongsToGroupRoleId;
        this.userBelongsToGroupId = value.userBelongsToGroupId;
        this.permissionRoleId = value.permissionRoleId;
        this.createTime = value.createTime;
        this.createUserId = value.createUserId;
        this.lastModifyTime = value.lastModifyTime;
        this.lastModifyUserId = value.lastModifyUserId;
        this.isDeleted = value.isDeleted;
    }

    public UserBelongsToGroupRole(
        ULong         userBelongsToGroupRoleId,
        ULong         userBelongsToGroupId,
        ULong         permissionRoleId,
        LocalDateTime createTime,
        ULong         createUserId,
        LocalDateTime lastModifyTime,
        ULong         lastModifyUserId,
        ULong         isDeleted
    ) {
        this.userBelongsToGroupRoleId = userBelongsToGroupRoleId;
        this.userBelongsToGroupId = userBelongsToGroupId;
        this.permissionRoleId = permissionRoleId;
        this.createTime = createTime;
        this.createUserId = createUserId;
        this.lastModifyTime = lastModifyTime;
        this.lastModifyUserId = lastModifyUserId;
        this.isDeleted = isDeleted;
    }

    public ULong getUserBelongsToGroupRoleId() {
        return this.userBelongsToGroupRoleId;
    }

    public void setUserBelongsToGroupRoleId(ULong userBelongsToGroupRoleId) {
        this.userBelongsToGroupRoleId = userBelongsToGroupRoleId;
    }

    public ULong getUserBelongsToGroupId() {
        return this.userBelongsToGroupId;
    }

    public void setUserBelongsToGroupId(ULong userBelongsToGroupId) {
        this.userBelongsToGroupId = userBelongsToGroupId;
    }

    public ULong getPermissionRoleId() {
        return this.permissionRoleId;
    }

    public void setPermissionRoleId(ULong permissionRoleId) {
        this.permissionRoleId = permissionRoleId;
    }

    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public ULong getCreateUserId() {
        return this.createUserId;
    }

    public void setCreateUserId(ULong createUserId) {
        this.createUserId = createUserId;
    }

    public LocalDateTime getLastModifyTime() {
        return this.lastModifyTime;
    }

    public void setLastModifyTime(LocalDateTime lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public ULong getLastModifyUserId() {
        return this.lastModifyUserId;
    }

    public void setLastModifyUserId(ULong lastModifyUserId) {
        this.lastModifyUserId = lastModifyUserId;
    }

    public ULong getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(ULong isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserBelongsToGroupRole (");

        sb.append(userBelongsToGroupRoleId);
        sb.append(", ").append(userBelongsToGroupId);
        sb.append(", ").append(permissionRoleId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(createUserId);
        sb.append(", ").append(lastModifyTime);
        sb.append(", ").append(lastModifyUserId);
        sb.append(", ").append(isDeleted);

        sb.append(")");
        return sb.toString();
    }
}
