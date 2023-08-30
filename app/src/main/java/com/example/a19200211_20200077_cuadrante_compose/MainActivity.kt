package com.example.a19200211_20200077_cuadrante_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.leanback.widget.Row
import com.example.a19200211_20200077_cuadrante_compose.ui.theme._19200211_20200077_cuadrante_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _19200211_20200077_cuadrante_composeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CuadranteApp()
                }
            }
        }
    }
}

@Composable
fun CuadranteApp() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            TarjetaInformacion(
                titulo = stringResource(R.string.texto_componible),
                descripcion= stringResource(R.string.muestra_texto_y_sigue_las_pautas_recomendadas_de_material_design) ,
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            TarjetaInformacion(
                titulo = stringResource(R.string.imagen_componible),
                descripcion = stringResource(R.string.crea_un_elemento_componible_que_dise_a_y_dibuja_un_objeto_de_clase_painter_determinado) ,
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            TarjetaInformacion(
                titulo = stringResource(R.string.fila_componible),
                descripcion = stringResource(R.string.un_dise_o_componible_que_coloca_a_sus_elementos_secundarios_en_una_secuencia_horizontal),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            TarjetaInformacion(
                titulo = stringResource(R.string.columna_componible),
                descripcion = stringResource(R.string.un_dise_o_componible_que_coloca_a_sus_elementos_secundarios_en_una_secuencia_vertical),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}


@Composable
private fun TarjetaInformacion(
    titulo: String,
    descripcion: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = titulo,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = descripcion,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CuadranteAppPrevio() {
    _19200211_20200077_cuadrante_composeTheme {
        CuadranteApp()
    }
}