package com.android.commonlibray.util.permission;

import java.util.List;

/**
 * @author: cpacm
 * @date: 2016/10/9
 * @desciption: 接收权限
 */

public interface OnPermissionsGrantedListener {
    void onPermissionsGranted(PermissionBuilder builder, List<String> perms);
}
