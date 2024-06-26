// Copyright 2024 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.example.sample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.textview.MaterialTextView
import com.google.recaptcha.sample.R

class HomeFragment(private val loginViewModel: LoginViewModel): Fragment(R.layout.home_view) {

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    loginViewModel.loggedUser.value?.let {
      view.findViewById<MaterialTextView>(R.id.txt_home_username).text = it
    }
  }
}