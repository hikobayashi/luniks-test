/**
 * 
 */
package org.pinokiwo.sample.test;

import org.pinokiwo.sample.LuniksActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;
import android.util.Log;

/**
 * @author yasikoba
 *
 */
public class LuniksActivityTest extends
		ActivityInstrumentationTestCase2<LuniksActivity> {

    public LuniksActivityTest() {
        super("org.pinokiwo.sample", LuniksActivity.class);
      }

	private LuniksActivity mActivity;
	private TextView mView;
	private String resourceString;
	
	

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mActivity = this.getActivity();
        mView = (TextView) mActivity.findViewById(org.pinokiwo.sample.R.id.text);
        resourceString = mActivity.getString(org.pinokiwo.sample.R.string.hello);
    }
    
	@Override 
	protected void tearDown() throws Exception {
		super.tearDown();
	}

    public void testPreconditions() {
        assertNotNull(mView);
    }
    
    public void testText() {
    	Log.i("hoge",resourceString);
    	Log.i("hage",(String)mView.getText());
    	
        assertEquals(resourceString,(String)mView.getText());
    }
    
    
}
