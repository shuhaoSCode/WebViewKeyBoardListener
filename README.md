# WebViewKeyBoardListener
一行代码 搞定webview全屏键盘界面不能上弹问题

## 如何导入？

* Android Studio

		allprojects {
			repositories {
			  ...
			  maven { url 'https://jitpack.io' }
			}
		}
		  
		dependencies {
	       compile 'com.github.shuhaoSCode:WebViewKeyBoardListener:1.0.0'
		}


* eclipse。。。请自行copy class。

## 当前功能
* 解决全屏在任何情况下键盘不能上弹问题

## 如何使用
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        KeyBoardListener.getInstance().init(this);
    }
[![](https://jitpack.io/v/shuhaoSCode/WebViewKeyBoardListener.svg)](https://jitpack.io/#shuhaoSCode/WebViewKeyBoardListener)
