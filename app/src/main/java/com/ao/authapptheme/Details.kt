package com.ao.authapptheme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Details ()
{
    Column(
        Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .padding(8.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .size(200.dp)
                .clip(RoundedCornerShape(50)),
            painter = painterResource(R.drawable.java),
            contentDescription = null
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            "Java",
            fontWeight = FontWeight.Bold,
            fontSize = 35.sp

        )

        Spacer(modifier = Modifier.height(16.dp))

        Text("Java é uma linguagem de programação orientada a objetos, amplamente reconhecida por sua portabilidade, robustez e segurança. Criada pela Sun Microsystems em 1995, e agora desenvolvida pela Oracle Corporation, Java continua a ser uma das linguagens mais populares e influentes no mundo da tecnologia, alimentando desde aplicativos móveis até sistemas empresariais complexos.\n" +
                "Principais Características de Java:\n" +
                "\n" +
                "    Portabilidade (WORA - Write Once, Run Anywhere): Um dos maiores atrativos de Java é a capacidade de escrever o código uma vez e executá-lo em qualquer plataforma que suporte a Máquina Virtual Java (JVM). Isso é possível porque o código-fonte é compilado em bytecode, que a JVM interpreta, garantindo que o mesmo programa funcione em diferentes sistemas operacionais.\n" +
                "\n" +
                "    Orientação a Objetos: Java segue os princípios da programação orientada a objetos, o que promove modularidade, reutilização de código e facilidade de manutenção. Os conceitos centrais incluem classes, objetos, herança, encapsulamento, polimorfismo e abstração.\n" +
                "\n" +
                "    Segurança: Java foi projetada com a segurança em mente, especialmente para ambientes de rede. Ele oferece funcionalidades de segurança como a verificação de bytecode, gerenciamento de memória seguro e um modelo de execução restrito, que protege o sistema de acesso não autorizado ou operações perigosas.\n" +
                "\n" +
                "    Multithreading: Java fornece suporte nativo para programação multithread, o que facilita o desenvolvimento de aplicativos que podem executar várias tarefas simultaneamente. Isso é útil para aplicações que requerem alta performance e resposta ágil, como servidores de rede e interfaces de usuário.\n" +
                "\n" +
                "    Desempenho e Otimização: Embora a JVM interprete bytecode, Java possui recursos como o Just-In-Time (JIT) compiler, que traduz bytecode em código nativo durante a execução, melhorando significativamente o desempenho.\n" +
                "\n" +
                "Ecosistema e Frameworks:\n" +
                "\n" +
                "Java possui um vasto ecossistema de bibliotecas e frameworks que facilitam o desenvolvimento de diferentes tipos de aplicações:\n" +
                "\n" +
                "    Spring Framework: Muito usado no desenvolvimento de aplicações corporativas e web, facilitando a criação de aplicações robustas e escaláveis.\n" +
                "    Hibernate: Uma poderosa ferramenta de mapeamento objeto-relacional (ORM) que simplifica o gerenciamento de banco de dados em Java.\n" +
                "    Android Development: Java é uma das linguagens principais para o desenvolvimento de aplicativos Android, proporcionando uma base sólida para criar soluções móveis.\n" +
                "\n" +
                "Aplicações de Java:\n" +
                "\n" +
                "    Desenvolvimento Web: Com frameworks como Spring, Java é uma escolha comum para desenvolver aplicações web seguras e de alto desempenho.\n" +
                "    Aplicativos Móveis: Antes da popularidade do Kotlin, Java era a principal linguagem para o desenvolvimento Android.\n" +
                "    Sistemas Empresariais: Java é amplamente usado em soluções corporativas devido à sua estabilidade e capacidade de lidar com grandes volumes de dados.\n" +
                "    Internet das Coisas (IoT): Com sua portabilidade, Java também é uma escolha para dispositivos conectados em redes IoT.\n" +
                "    Inteligência Artificial e Machine Learning: Embora Python seja mais comum nesse campo, Java ainda é usado, especialmente em sistemas que exigem processamento paralelo.\n" +
                "\n" +
                "Comunidade e Evolução:\n" +
                "\n" +
                "Java continua a evoluir, com versões regulares que introduzem novos recursos, melhorias de desempenho e segurança. A comunidade de desenvolvedores Java é vibrante e global, proporcionando uma vasta quantidade de recursos de aprendizado, suporte e oportunidades de networking.\n" +
                "Conclusão:\n" +
                "\n" +
                "Java mantém sua relevância no cenário de desenvolvimento de software devido à sua confiabilidade, maturidade e suporte contínuo. Com uma curva de aprendizado acessível e um forte conjunto de recursos, é uma escolha sólida tanto para iniciantes quanto para desenvolvedores experientes que buscam criar aplicações de alto nível e escaláveis.")
    }
}

@Preview(showBackground = true)
@Composable
fun DetailsPreview ()
{
    Surface(

    ) {
        Details()
    }
}