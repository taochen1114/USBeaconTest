/** ============================================================== */
package com.THLight.USBeacon.Sample;
/** ============================================================== */
import com.THLight.USBeacon.App.Lib.iBeaconData;

/** ============================================================== */
public class ScanediBeacon extends iBeaconData
{
	public long lastUpdate= 0;
	
	/** ================================================ */
	public static ScanediBeacon copyOf(iBeaconData iBeacon)
	{
		ScanediBeacon newBeacon	= new ScanediBeacon();
		
		newBeacon.beaconUuid	= iBeacon.beaconUuid;
		newBeacon.major			= iBeacon.major;
		newBeacon.minor			= iBeacon.minor;
		newBeacon.oneMeterRssi	= iBeacon.oneMeterRssi;
		newBeacon.rssi			= iBeacon.rssi;
		newBeacon.lastUpdate	= 0;
		
		return newBeacon;
	}
	
	/** ================================================ */
	public static ScanediBeacon copyOf(ScanediBeacon scanBeacon)
	{
		ScanediBeacon newBeacon	= new ScanediBeacon();
		
		newBeacon.beaconUuid	= scanBeacon.beaconUuid;
		newBeacon.major			= scanBeacon.major;
		newBeacon.minor			= scanBeacon.minor;
		newBeacon.oneMeterRssi	= scanBeacon.oneMeterRssi;
		newBeacon.rssi			= scanBeacon.rssi;
		newBeacon.lastUpdate	= scanBeacon.lastUpdate;
		
		return newBeacon;
	}
}

/** ============================================================== */

