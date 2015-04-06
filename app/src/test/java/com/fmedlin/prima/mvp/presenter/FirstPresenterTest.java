package com.fmedlin.prima.mvp.presenter;

import com.fmedlin.prima.mvp.presenter.FirstPresenter.FirstModel;
import com.fmedlin.prima.mvp.presenter.FirstPresenter.FirstView;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.fail;

public class FirstPresenterTest {

    FirstPresenter presenter;
    @Mock FirstModel model;
    @Mock FirstView view;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        presenter = new FirstPresenter(model, view);
    }

    @Test
    public void itShouldFail() {
        fail("Implement me");
    }
}