# Non Swipeable Viewpager
[![](https://jitpack.io/v/dutchmanbd/nonswipeableviewpager.svg)](https://jitpack.io/#dutchmanbd/nonswipeableviewpager)
[![Build Status](https://travis-ci.org/dutchmanbd/nonswipeableviewpager.svg?branch=master)](https://travis-ci.org/dutchmanbd/nonswipeableviewpager)
[![GitHub](https://img.shields.io/github/license/dutchmanbd/nonswipeableviewpager)](https://github.com/dutchmanbd/nonswipeableviewpager/blob/master/LICENSE)

## Get Started

Add it in your root build.gradle at the end of repositories:

```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
 Add the dependency

``` 
dependencies {
	implementation 'com.github.dutchmanbd:nonswipeableviewpager:0.1.0'
}
```

## How to use

Add Following viewpager in your layout
 ```
 <com.ticonsys.nonswipeableviewpager.NonSwipeableViewPager
        android:id="@+id/viewPager"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_marginStart="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginBottom="8dp"/>
```

### In activity

```
mAdapter = MyPagerAdapter(supportFragmentManager);
viewPager.adapter = mAdapter

ivLeft.setOnClickListener{
	if(currentPosition > 0){
	currentPosition--;
	viewPager.setCurrentItem(currentPosition);
	}
}

ivRight.setOnClickListener {
	if(currentPosition < mAdapter.getCount()-1){
	    currentPosition++;
	    viewPager.setCurrentItem(currentPosition);
	}
}

```

### Create Adapter

```
class MyPagerAdapter(
        fm: FragmentManager
): FragmentStatePagerAdapter(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        return when (position){
            0 -> ProductFragment()
            else -> PaymentFragment()
        }
    }
    override fun getCount() = 2
}
```

