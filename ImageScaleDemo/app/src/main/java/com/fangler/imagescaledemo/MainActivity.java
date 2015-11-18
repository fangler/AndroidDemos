package com.fangler.imagescaledemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

  ImageView before;
  ImageView after;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    before = ((ImageView) findViewById(R.id.before));
    after = (ImageView) findViewById(R.id.after);

    Picasso.with(this).load("http://img.hb.aicdn.com/b0a2852dd080e0a90f69eac7d0311d6c4f6d62c63bfc0-7simSz_fw658").into(before);
    Picasso.with(this).load("http://img.hb.aicdn.com/b0a2852dd080e0a90f69eac7d0311d6c4f6d62c63bfc0-7simSz_fw658").into(after);

//    Picasso.with(this).load("http://img.hb.aicdn.com/7221fce1d92fb49f48baaedec7c5240a70e5798d2ddda-UzW68A_fw658").into(before);
//    Picasso.with(this).load("http://img.hb.aicdn.com/7221fce1d92fb49f48baaedec7c5240a70e5798d2ddda-UzW68A_fw658").into(after);
//    http://img2.imgtn.bdimg.com/it/u=141284048,2505042840&fm=21&gp=0.jpg
    Picasso.with(this).load("http://static.quna.com/meishi/caipuimg/214/132214.jpg").into(before);
    Picasso.with(this).load("http://static.quna.com/meishi/caipuimg/214/132214.jpg").into(after);
//    http://static.quna.com/meishi/caipuimg/214/132214.jpg
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();
    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
    //noinspection SimplifiableIfStatement
    switch (id) {
      case R.id.fitXY:
        scaleType = ImageView.ScaleType.FIT_XY;
        break;
      case R.id.fitStart:
        scaleType = ImageView.ScaleType.FIT_START;
        break;
      case R.id.fitCenter:
        scaleType = ImageView.ScaleType.FIT_CENTER;
        break;
      case R.id.fitEnd:
        scaleType = ImageView.ScaleType.FIT_END;
        break;
      case R.id.center:
        scaleType = ImageView.ScaleType.CENTER;
        break;
      case R.id.centerCrop:
        scaleType = ImageView.ScaleType.CENTER_CROP;
        break;
      case R.id.centerInside:
        scaleType = ImageView.ScaleType.CENTER_INSIDE;
        break;
      case R.id.matrix:
        scaleType = ImageView.ScaleType.MATRIX;
        break;
    }
    after.setScaleType(scaleType);

    return super.onOptionsItemSelected(item);
  }
}
