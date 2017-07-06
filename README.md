# CustomTextView

自定义TextView 实现填充色、圆角、文字变色、边框、边框颜色、背景图等功能，再也不用写一大堆shape这样xml了。

## 效果

<img src="https://github.com/jiaowenzheng/CustomTextView/raw/master/pic.png" width="450" height="800"/>  

<br/>

## 更新

 * 新增 noLeftStroke、noTopStroke、noRightStroke、noBottomStroke 四个属性.
 * 重新命名四个属性 normalSolidColor、pressedSolidColor、normalStrokeColor、pressedStrokeColor、roundLeftTopRadius、roundLeftBottomRadius、roundRightTopRadius、roundRightBottomRadius.
 * 增加一个实现导航标签事例 用xml实现.
        
## 属性

          textStrokeColor                                边框颜色 
          textRadius                                     textView弧度
          textLeftTopRadius                              textView左上角弧度   
          textLeftBottomRadius                           textView左下角弧度
          textRightTopRadius                             textView右上角弧度
          textRightBottomRadius                          textView右下角弧度   
          textStrokeWidth                                边框宽度
          textDrawable                                   图片
          textNormalTextColor                            正常状态文字颜色
          textSelectedTextColor                          按下状态文字颜色
          textNoLeftStroke                               无左描边线
          textNoRightStroke                              无右描边线
          textNoTopStroke                                无上描边线
          textNoBottomStroke                             无底部描边线
          textPressedSolidColor                          按下填充色
          textNormalSolidColor                           正常背景填充色
          textIsSelected                                 是否支持button选中状态 与setSelected()配合使用
          
## 用法
 * xml中使用方法

          xmlns:app="http://schemas.android.com/apk/res-auto"
          
          <com.library.CustomTextView
                android:layout_width="match_parent"
                android:layout_height="50dp"
                android:text="45弧度按下改变文字颜色TextView"
                android:textSize="16sp"
                android:gravity="center"
                android:layout_marginTop="10dp"
                app:textRadius="@dimen/radius_45"
                app:textSolidColor="@color/color_303f9f"
                app:textNormalTextColor="@color/color_ff0000"
                app:textSelectedTextColor="@color/color_00ff00"
                app:textStrokeWidth="2dp"
                />    
                
 * 代码中实现方法  
 
             /**
              * 设置填充图片
              *
              * @param drawableId  drawable id
              */
              public void setTextDrawable(int drawableId)
              
             /**
              *
              * 设置填充颜色
              *
              * @param colorId   颜色id
              */
              public void setSolidColor(int colorId)  
              
             /**
             * 设置圆角弧度
             *
             * @param leftTopRadius         左上角弧度
             * @param leftBottomRadius      左下角弧度
             * @param rightTopRadius        右上角弧度
             * @param rightBottomRadius     右下角弧度
             */
             public void setRadius(int leftTopRadius, int leftBottomRadius, int rightTopRadius, int rightBottomRadius) 
             
             /**
               * 设置边框颜色及宽度
               *
               * @param strokeWidth      边框宽度
               * @param colorId          边框颜色 id
               */
              public void setStrokeColorAndWidth(int strokeWidth,int colorId)   
              
             /**
               * 设置textView选中状态颜色
               *
               * @param normalTextColor     正常状态颜色
               * @param selectedTextColor   按下状态颜色
               */
              public void setSelectedTextColor(int normalTextColor,int selectedTextColor)    
              