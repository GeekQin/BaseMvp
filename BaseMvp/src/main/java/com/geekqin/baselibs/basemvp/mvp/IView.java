package com.geekqin.baselibs.basemvp.mvp;

/**
 * @author QinJun
 * @date 2019/4/11
 */
public interface IView {
    //显示loading
    void showLoading();

    //隐藏loading
    void hideLoading();

    //显示吐司
    void showError(String msg);
}
