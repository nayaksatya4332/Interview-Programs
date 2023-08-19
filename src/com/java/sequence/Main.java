package com.java.sequence;

import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void subSets(char[] input){
		List<Character> res = new ArrayList<>();
		solve(input,res,0);
	}
	public static void solve(char[] input,List<Character> res,int n){
		if(n >= input.length){
			System.out.println(res);
			return;
		}
		res.add(input[n]);
		solve(input,res,n+1);
		res.remove(res.size()-1);
		solve(input,res,n+1);
			
	}
	public static void main(String[] args){
		char[] input = {'A','B','C'};
		subSets(input);
	}
}
