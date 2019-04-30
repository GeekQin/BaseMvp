package com.geekqin.baselibs.basemvp.mvp;

/**
 * @author QinJun
 * @date 2019/4/11
 */
public interface IPresenter<V extends IView> {
    /**
     * 绑定 View
     */
    void attachView(V mView);

    /**
     * 解除 View
     */
    void detachView();
}
