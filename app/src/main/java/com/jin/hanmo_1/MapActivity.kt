package com.jin.hanmo_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import com.jin.hanmo_1.Social.SocialActivity
import net.daum.mf.map.api.MapPOIItem
import net.daum.mf.map.api.MapPoint
import net.daum.mf.map.api.MapView

class MapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        //사용자 아이콘 클릭 -> 마이페이지 이동
        val mypage = findViewById<ImageView>(R.id.user)
        mypage.setOnClickListener {
            val intent = Intent(this,MypageActivity::class.java)
            startActivity(intent)
        }

        //지구본 아이콘 클릭 -> 게시판 이동
        val social = findViewById<ImageView>(R.id.social)
        social.setOnClickListener {
            val intent = Intent(this, SocialActivity::class.java)
            startActivity(intent)
        }

        val getdata = intent.getStringExtra("data")
        val map = MapView(this)
        val mapView = findViewById<RelativeLayout>(R.id.mapView)

        //초기 지도 레벨 설정 & 손가락 줌 가능하게
        map.setZoomLevel(2, true)
        map.zoomIn(true)
        map.zoomOut(true)

        val marker = MapPOIItem()

        if (getdata == "1") {
            val mapPoint = MapPoint.mapPointWithGeoCoord(37.54657027347241, 127.11903857362242)
            map.setMapCenterPoint(mapPoint, true)
            marker.itemName = "강서지구"
            marker.tag = 0
            marker.mapPoint = mapPoint
            marker.markerType = MapPOIItem.MarkerType.BluePin
            map.addPOIItem(marker)
            mapView.addView(map)
        }
        if (getdata == "2") {
            val mapPoint = MapPoint.mapPointWithGeoCoord(37.54207113754575, 126.8967590924397)
            map.setMapCenterPoint(mapPoint, true)
            mapView.addView(map)
        }
        if (getdata == "3") {
            val mapPoint = MapPoint.mapPointWithGeoCoord(37.56774714881331, 126.8755680976324)
            map.setMapCenterPoint(mapPoint, true)
            mapView.addView(map)
        }
        if (getdata == "4") {
            val mapPoint = MapPoint.mapPointWithGeoCoord(37.55268760597764, 126.8999018684844)
            map.setMapCenterPoint(mapPoint, true)
            mapView.addView(map)
        }
        if (getdata == "5") {
            val mapPoint = MapPoint.mapPointWithGeoCoord(37.543281766518895, 126.90059337485462)
            map.setMapCenterPoint(mapPoint, true)
            mapView.addView(map)
        }
        if (getdata == "6") {
            val mapPoint = MapPoint.mapPointWithGeoCoord(37.526128119564426, 126.93496211173097)
            map.setMapCenterPoint(mapPoint, true)
            mapView.addView(map)
        }
        if (getdata == "7") {
            val mapPoint = MapPoint.mapPointWithGeoCoord(37.51729001167359, 126.97058426037518)
            map.setMapCenterPoint(mapPoint, true)
            mapView.addView(map)
        }
        if (getdata == "8") {
            val mapPoint = MapPoint.mapPointWithGeoCoord(37.50971611184992, 126.99470671978206)
            map.setMapCenterPoint(mapPoint, true)
            mapView.addView(map)
        }
        if (getdata == "9") {
            val mapPoint = MapPoint.mapPointWithGeoCoord(37.52732930277259, 127.01908517696988)
            map.setMapCenterPoint(mapPoint, true)
            mapView.addView(map)
        }
        if (getdata == "10") {
            val mapPoint = MapPoint.mapPointWithGeoCoord(37.52936950691133, 127.06894947969734)
            map.setMapCenterPoint(mapPoint, true)
            mapView.addView(map)
        }
        if (getdata == "11") {
            val mapPoint = MapPoint.mapPointWithGeoCoord(37.5178505686523, 127.0824223700259)
            map.setMapCenterPoint(mapPoint, true)
            mapView.addView(map)
        }
        if (getdata == "12") {
            val mapPoint = MapPoint.mapPointWithGeoCoord(37.54657027347241, 127.11903857362242)
            map.setMapCenterPoint(mapPoint, true)
            mapView.addView(map)
        }
    }
}
