package com.wastl;

import java.io.File;

import android.os.Environment;

/**
 * @author Lukas Bernreiter
 * @version 1.3, 19/06/2012
 * @since 1.2.1
 */
public class AppFacade
{
	private static final String TAG = "WASTL Mobile";
	
	private static final String PATH = "/data/WASTL/";
	private static final File SD = Environment.getExternalStorageDirectory();
	private static final String FILENAME = "wastlmain.xml";
	private static final String TMP_FILENAME = "wastltmp.xml";
	private static final String URL_MAIN = "http://www.feuerwehr-krems.at/CodePages/Wastl/GetDaten/getwastlmain.asp";
	private static final String URL_DISTRICT = "http://www.feuerwehr-krems.at/CodePages/Wastl/GetDaten/GetWastlBezirk.asp";
	
	private static final String EX_DETAILS = "district_details";
	private static final String EX_ID = "district_id";
	private static final String EX_FID = "firedepartment_id";
	private static final String EX_LAT = "latitude";
	private static final String EX_LONG = "longitude";
	private static final String EX_NAME = "name";
	
	/** Retrieves the tag of the application. Used for logging */ 
	public static String GetTag(){ return TAG;}
	
	/** Retrieves the path to store the files. */
	public static String GetPath(){ return SD + PATH; }
	
	/** Retrieves the path to the SD card. */
	public static File GetSD(){ return SD; }
	
	/** Retrieves the filename. Used to store the files */
	public static String GetFilename(){ return FILENAME; }
	
	/** Retrieves the full path to the main XML file. */
	public static String GetFullPath(){ return SD+PATH+FILENAME; }
	
	/** Retrieves the main URL. */
	public static String GetMainURL(){ return URL_MAIN; }
	
	/** Retrieves the URL for the districts. */
	public static String GetDistrictURL(){ return URL_DISTRICT; }
	
	/** Retrieves the full path to the temporary file. */
	public static String GetTmpFullPath() { return SD+PATH+TMP_FILENAME; }
	
	public static String GetExDetails(){ return EX_DETAILS; }
	
	public static String GetExId(){ return EX_ID; }			
	
	public static String GetExFId() { return EX_FID; }
	
	public static String GetExLat() { return EX_LAT; }
	
	public static String GetExLong() { return EX_LONG; }
	
	public static String GetExName() { return EX_NAME; }
}
