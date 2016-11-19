### This is still in progress, it can break at anytime.

Currently supports String, Boolean, boolean, int, Integer.

## Usage:

Step 1
<pre><code>
android{...}
repositories {
	maven {
    	url "https://jitpack.io"
	}
}</code></pre>

Step 2

<pre><code>
android{...}
buildscript {
	repositories {
		mavenCentral()
    }
	dependencies {
		classpath 'com.neenbedankt.gradle.plugins:android-apt:1.8'
	}
}
apply plugin: 'com.neenbedankt.android-apt'</code></pre>

Step 3

<pre><code>
android{...}
dependencies {
	apt 'com.github.shrikanthkr:saveinstance-processor:v0.0.3'
	compile 'com.github.shrikanthkr:saveinstance-api:-SNAPSHOT'
}</code></pre>


## Sample

* In your activity code

<pre><code>
@SaveInstance
Stirng hello;
</code></pre>

* <b>OnCreate Method</b>

<pre><code>
@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
	if(savedInstanceState != null) {
		Retainer.load(this, savedInstanceState);
	}
}
</code></pre>

* <b>OnSaveInstanceState Method</b>

<pre><code>
@Override
protected void onSaveInstanceState(Bundle outState) {
	super.onSaveInstanceState(outState);
	Retainer.save(this, outState);
}
</code></pre>
