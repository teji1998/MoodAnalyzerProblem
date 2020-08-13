package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
	//To test sad mood
	public void testSadMood(){
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
		String mood = moodAnalyzer.analyzeMood();
		Assert.assertEquals("SAD", mood);
	}

	@Test
	//to test happy mood
	public void testHappyMood(){
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
		String mood = moodAnalyzer.analyzeMood();
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	//to test any mood
	public void testAnyMood() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any Mood");
		String mood = moodAnalyzer.analyzeMood();
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	//to test null value
	public void testNullInput() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
		try {
			String mood = moodAnalyzer.analyzeMood();
		}catch(MoodAnalyzerException e) {
			Assert.assertEquals(MoodAnalyzerException.ExceptionType.NULL, e.type);
		}
	}

	@Test
	//To test empty value
	public void testEmptyInput(){
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
		try{
			String mood = moodAnalyzer.analyzeMood();
		}catch (MoodAnalyzerException e){
			Assert.assertEquals(MoodAnalyzerException.ExceptionType.EMPTY,e.type);
		}
	}
}

