# LinkedTextViewWithEmojicons

It is a library which can be used to ```linkify textview``` based on ```custom token``` defined either in the ```attrs.xml``` or in the ```properties``` of the ```textview``` in the layout file of a class.

This library is availble in jcenter repository.
The compile statement to be written in ```build.gradle``` file is as below:

```compile 'com.dexter.linkedtextviewwithemojicons:linkedtextviewwithemojicons:1.0'```

# How to use

This library can be used in two ways

1. By defining the app:highlight_token in the linkedtextview under the layout xml file.
2. By creating a style for the linkedtextview if the token are same for whole project.

Example:-

# In layout xml file

```
<com.dexter.linkedtextviewwithemojicons.ui.LinkedTextView
        android:id="@+id/tvText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="4dp"
        app:highlight_token="\#,\@,https:\/\/" />
```

# In styles.xml

```
<style name="TextView" />

    <!-- Style to linkify all textview in common. -->
    <style name="TextView.LinkedTextView">
        <item name="highlight_token">\#,\@,https:\/\/</item>
    </style>
```

Also you can use the onLinkClickListener if you want to perform some action on the click of the linkified text.

# OnLinkClickListener

```
//ClickListener for linkified text
        tvText.setOnLinkClickListener(new LinkedTextView.OnLinkClickListener() {
            @Override
            public void onLinkClick(String link, int start, int end) {
                Toast.makeText(SampleActivity.this, link + "\t" + "Clicked", Toast.LENGTH_SHORT).show();
            }
        });
```
