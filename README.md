# ZoomImageView-android


![Sample Home](https://raw.githubusercontent.com/sheetalkumar105/ZoomImageView-android/master/demo.gif)


## How to
To get a Git project into your build:

### Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
### Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.sheetalkumar105:ZoomImageView-android:1.02'
	}

### Step 3. Add ZoomImageView in your layout

```xml
<com.impulsive.zoomimageview.ZoomImageView
      android:layout_width="match_parent"
      android:layout_height="300dp"
      android:src="@drawable/sample"
      android:scaleType="matrix"
      app:rotation="true" 
      app:scaledown="true"
      />
```
app:rotation="true"  // Allow to rotate image in view. Default value is true.


app:scaledown="true" // Allow to ZoomOut less than container size. Default value is false.

Demo is available on DevStudioOnline:
[Zoom or Rotate image on pinch or touch in Android ImageView](https://devstudioonline.com/article/zoom-or-rotate-image-on-pinch-or-touch-in-android-imageview)

