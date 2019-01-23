package id.estock.app.utils

import android.Manifest
import android.Manifest.permission.READ_EXTERNAL_STORAGE
import android.Manifest.permission.WRITE_EXTERNAL_STORAGE
import android.annotation.SuppressLint
import android.app.Activity
import android.content.pm.PackageManager
import android.os.Build
import android.support.annotation.RequiresApi
import android.support.v4.content.ContextCompat
import android.widget.Toast

/**
 * Created by RadhikaYusuf on 15-Mar-18.
 */
class CameraGalleryHelper {
    companion object {
        const val REQUEST_CAMERA_CODE = 123
        const val REQUEST_GALLERY_CODE = 456
        @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
        private val PERMISSIONS_EXTERNAL_STORAGE = arrayOf(READ_EXTERNAL_STORAGE, WRITE_EXTERNAL_STORAGE)
        private val PERMISSIONS_CAMERA = arrayOf(Manifest.permission.CAMERA)


        @SuppressLint("ObsoleteSdkInt")
        @JvmStatic
        fun checkCameraPermission(activity: Activity): Boolean {
            if (android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                return true
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                return if (ContextCompat.checkSelfPermission(activity, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED) {
                    true
                } else {
                    activity.requestPermissions(PERMISSIONS_CAMERA, REQUEST_CAMERA_CODE)
                    false
                }
            }
            return true
        }

        @SuppressLint("ObsoleteSdkInt")
        fun checkExternalStoragePermission(activity: Activity): Boolean {
            if (android.os.Build.VERSION.SDK_INT < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                return true
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                val readStoragePermissionState = ContextCompat.checkSelfPermission(activity, READ_EXTERNAL_STORAGE)
                val writeStoragePermissionState = ContextCompat.checkSelfPermission(activity, WRITE_EXTERNAL_STORAGE)
                val externalStoragePermissionGranted = readStoragePermissionState == PackageManager.PERMISSION_GRANTED
                        && writeStoragePermissionState == PackageManager.PERMISSION_GRANTED
                if (!externalStoragePermissionGranted) {
                    activity.requestPermissions(PERMISSIONS_EXTERNAL_STORAGE, REQUEST_GALLERY_CODE)
                    return false
                }
                return true
            }
            return true
        }
    }
}