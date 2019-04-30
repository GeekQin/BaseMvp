package com.geekqin.baselibs.basemvp.base;

import com.geekqin.baselibs.basemvp.mvp.BasePresenter;
import com.geekqin.baselibs.basemvp.mvp.IView;


import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * @author QinJun
 * @date 2019/4/14
 * @desc
 */
public abstract class BaseMvpActivity <T extends BasePresenter> extends BaseActivity implements IView {

    protected T mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = createPresenter();
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
    }


    @Override
    public void showLoading() {
        showLoadingDialog();
    }

    @Override
    public void hideLoading() {
        hideLoadingDialog();
    }


    protected abstract T createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }

}
