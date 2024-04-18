package com.example.mytrips.repositorio

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.mytrips.R
import com.example.mytrips.model.Viagem
import java.time.LocalDate

class ViagemRepositorio {
    @Composable
        fun listarTodasAsViagens(): List<Viagem>{


            val londres = Viagem(
                id = 1,
                destino = "Londres",
                descricao = "London is the capital and largest city of  the United Kingdom, with a population of just under 9 million.",
                dataChegada = LocalDate.of(2019, 2, 18),
                dataPartida = LocalDate.of(2019, 2, 21),
                imagem = painterResource(id = R.drawable.london)
            )
            val porto = Viagem(
                id = 1,
                destino = "Porto",
                descricao = "Porto is the second city in Portugal, the capital of the Oporto District, and one of the Iberian Peninsula's major urban areas.",
                dataChegada = LocalDate.of(2022, 5, 15),
                dataPartida = LocalDate.of(2022, 5, 22),
                imagem = painterResource(id = R.drawable.porto)
            )
            val havai = Viagem(
                id = 2,
                destino = "Havaí",
                descricao = "Suas ilhas são conhecidas pelas paisagens acidentadas compostas de penhascos, cachoeiras, florestas tropicais e praias com areia dourada, vermelha, preta e até mesmo verde",
                dataChegada = LocalDate.of(2024, 2, 18),
                dataPartida = LocalDate.of(2024, 2, 21)
            )
            val bariloche = Viagem(
                id = 3,
                destino = "Bariloche",
                descricao = "é uma cidade localizada em meio a bosques milenares, montanhas cobertas de neve e lagos cristalinos na província do Rio Negro, na Argentina",
                dataChegada = LocalDate.of(2024, 4, 20),
                dataPartida = LocalDate.of(2024, 5, 30),

                )
            val monaco = Viagem(
                id = 4,
                destino = "Mônaco",
                descricao = "Banhado pelo mar Mediterrâneo, apresenta relevo formado por morros e colinas, além de clima e vegetação classificados como mediterrâneos",
                dataChegada = LocalDate.of(2024, 5, 18),
                dataPartida = LocalDate.of(2024, 5, 21),

            )
            val lagoPeyto = Viagem(
                id = 5,
                destino = "Lago Peyto",
                descricao = " É uma das atrações mais concorridas do Parque Nacional Banff. Ele fica azul-piscina no verão, formando uma bela visão com essa água rodeada por picos nevados",
                dataChegada = LocalDate.of(2024, 6, 18),
                dataPartida = LocalDate.of(2024, 6, 28)
            )
            val grecia = Viagem(
                id = 5,
                destino = "Grécia",
                descricao = " A Grécia também é conhecida por suas praias, como Santorini, com suas areias escuras, e os festivos complexos hoteleiros de Míconos.",
                dataChegada = LocalDate.of(2024, 7, 18),
                dataPartida = LocalDate.of(2024, 7, 28),

            )

            return listOf(londres, havai, bariloche, monaco, lagoPeyto, grecia)
        }
    }
