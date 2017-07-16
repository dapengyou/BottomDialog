在Activity中的应用：

```

    /**
     * 展示
     */
    private void showBottomDialog() {
        bottomDialog = new BottomDialog(this);
        bottomDialog.setClicklistener(new BottomDialog.ClickListenerInterface() {
            @Override
            public void onTitleClick() {

            }

            @Override
            public void onOneClick() {
                mTextView.setText(bottomDialog.getOneTv().getText().toString());
            }

            @Override
            public void onTwoClick() {
                mTextView.setText(bottomDialog.getTwoTv().getText().toString());
            }
        });
    }


```

被封装的Dialog主要提供的方法有：修改相应的TextView文字和颜色，提供点击相应的TextView的点击事件。

这里的点击事件主要用的是回调的方法，在Dialog中定义一个接口，在点击事件调用这个接口，当在Activity中触发这个回调接口时，点击事件产生。


最后说一下更改文字颜色的方法：

```
 public void setColor(int titleColor, int otherColor, int i) {}
```

第一个传的颜色是修改最上面的TextView，第二个传的颜色是修改其他的文字颜色，第三个参数是表明你选用哪种模式，分别传1或2，有2种模式

1. 标题和其他颜色不一样
2. 标题和其他颜色一样，取消键不一样

