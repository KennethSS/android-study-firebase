package com.solar.firebase.fcm

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

/**
 * Copyright 2020 Kenneth
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **/
class AppFirebaseMessagingService : FirebaseMessagingService() {
    override fun onNewToken(p0: String) {
        super.onNewToken(p0)
        Log.d("AppFirebaseMessagingService", "token: $p0")
    }

    override fun onMessageReceived(p0: RemoteMessage) {
        super.onMessageReceived(p0)
        Log.d("AppFirebaseMessagingService", "onMessageReceived ${p0}")
        Log.d("AppFirebaseMessagingService", "onMessageReceived ${p0.data.get("story_id")}")
        Log.d("AppFirebaseMessagingService", "onMessageReceived ${p0.notification?.title}")
        Log.d("AppFirebaseMessagingService", "onMessageReceived ${p0.notification?.body}")
    }
}