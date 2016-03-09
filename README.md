# TipsViewSample
A Sample that shows tip View when your app first launching

Usage
====
TipsView tipsView  = new TipsBuilder(this)
                .setCircle(false)
                .setCallback(new TipsViewInterface() {
                    @Override
                    public void gotItClicked() {
                        Toast.makeText(getApplicationContext(),"click",Toast.LENGTH_LONG).show();
                    }
                })
                .setDescription("This is helloworld")
                .setDescriptionColor(Color.parseColor("#ffffff"))
                .setBackgroundColor(Color.parseColor("#88000000"))
                .setTarget(textView)
                .setButtonVisibble(true)
                .setButtonTextColor(Color.parseColor("#000000"))
                .setButtonText("click me")
                .setTitle("This is Title")
                .setTitleColor(Color.parseColor("#ffffff"))
                .build();
        tipsView.show(this);

##Other Usage

you can set drawable object to TipsView 
TipsView tipsView  = new TipsBuilder(this)
	  		.setTarget(tv_smart_title)
	  		.setTitleColor(Color.parseColor("#fa5f5f"))
	  		.setDrawable(getResources().getDrawable(R.drawable.tips_2))
	  		.setCircle(false)
	  		.setDelay(1000)      
	  		.build();
	 		tipsView.setCircleColor(Color.WHITE);
	      	tipsView.show(this);

##Thanks

[fredericojssilva](https://github.com/fredericojssilva)
