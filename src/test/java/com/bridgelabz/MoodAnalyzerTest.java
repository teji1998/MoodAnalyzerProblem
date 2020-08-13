package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
	public void testHappyMood() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String moodState = moodAnalyzer.analyzeMood("This is a Happy Message");
		Assert.assertEquals("HAPPY", moodState);
	}

	@Test
	public void testSadMood() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String moodState = moodAnalyzer.analyzeMood("This is a Sad Message");
		Assert.assertEquals("SAD", moodState);
	}

	@Test
	public void testAnyMood() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String moodState = moodAnalyzer.analyzeMood("This is a Any Message");
		Assert.assertEquals("HAPPY", moodState);
	}
}
