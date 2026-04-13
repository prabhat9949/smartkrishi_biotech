package com.smartkrishi.presentation.dashboard

import android.app.Activity
import androidx.compose.ui.platform.LocalContext
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.smartkrishi.R
//import com.smartkrishi.ml.CropPrediction
import com.smartkrishi.ml.CropRecommendationHelper
import com.smartkrishi.presentation.chat.KrishiMitriChatScreen
import com.smartkrishi.presentation.chat.KrishiMitriChatViewModel
import com.smartkrishi.presentation.dashboard.Strings.pumpOn
import com.smartkrishi.presentation.home.FarmViewModel
import com.smartkrishi.presentation.model.Farm
import com.smartkrishi.presentation.model.SensorNode
import com.smartkrishi.presentation.navigation.Screen
import com.smartkrishi.presentation.theme.ThemeState
import com.smartkrishi.voice.VoiceCommandProcessor
import com.smartkrishi.voice.VoiceManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder
import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.roundToInt
import com.smartkrishi.voice.VoiceHandler
// ═══════════════════════════════════════════════════════════════════
//  THEME COLORS
// ═══════════════════════════════════════════════════════════════════
private val PrimaryGreen    = Color(0xFF2E7D32)
private val AccentGreenSoft = Color(0xFFC8E6C9)
private val LightBackground = Color(0xFFF3FBF5)
private val DarkBackground  = Color(0xFF0A1C12)
private val CardLight       = Color(0xFFFFFFFF)
private val CardDark        = Color(0xFF153525)
