package net.developermaster.navigationnavcontrollerjetpackcompose.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CaixaDeTextoOutLineTextField() {

    var texto by remember { mutableStateOf("") }

    OutlinedTextField( //todo caixa de texto com borda

        modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()
            .padding(all = 8.dp),

        value = texto,//todo valor do texto

        onValueChange = { textoDigitado ->

            texto = textoDigitado//todo valor do texto digitado na variavel texto

        },

        label = {

            Text(text = "Caixa de texto") //todo texto do label
        },

        leadingIcon = {
            Icon(
                imageVector = Icons.Default.DateRange,//todo icone
                contentDescription = null, modifier = Modifier.width(50.dp),//todo largura
                tint = Color.Blue//todo cor azul da borda
            )
        },

        trailingIcon = {
            Icon(
                imageVector = Icons.Default.Create,//todo icone
                contentDescription = null, modifier = Modifier.width(50.dp),//todo largura
                tint = Color.Blue//todo cor azul da borda
            )
        })
}