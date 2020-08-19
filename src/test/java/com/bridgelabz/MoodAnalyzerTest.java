package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

	//To test sad mood
	@Test
	public void givenMood_whenSadMood_shouldReturnSad(){
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
		String mood = moodAnalyzer.analyzeMood();
		Assert.assertEquals("SAD", mood);
	}

	//to test happy mood
	@Test
	public void givenMood_whenHappyMood_shouldReturnHappy(){
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Happy Mood");
		String mood = moodAnalyzer.analyzeMood();
		Assert.assertEquals("HAPPY", mood);
	}

	//to test any mood
	@Test
	public void givenMood_whenAnyMood_shouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any Mood");
		String mood = moodAnalyzer.analyzeMood();
		Assert.assertEquals("HAPPY", mood);
	}

	//to test null value
	@Test
	public void givenMood_whenNull_shouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
		try {
			String mood = moodAnalyzer.analyzeMood();
		}catch(MoodAnalyzerException e) {
			Assert.assertEquals(MoodAnalyzerException.ExceptionType.NULL, e.type);
		}
	}

	//To test empty value
	@Test
	public void givenMood_whenEmpty_shouldReturnEmptyMood(){
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
		try{
			String mood = moodAnalyzer.analyzeMood();
		}catch (MoodAnalyzerException e){
			Assert.assertEquals(MoodAnalyzerException.ExceptionType.EMPTY,e.type);
		}
	}
}

