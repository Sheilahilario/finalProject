# <h1 >Kotlin Programming Fundamentals - Assessment

É hora de vermos o quanto você aprendeu sobre Kotlin e Programação Orientada a Objetos

<h2>Parte 1: Entendendo o projeto Estudante</h2>
Baixe o código fonte deste projeto e importe para dentro do IntelliJ
Entenda a estrutura do projeto:
Pacotes
Classes
Funcionalidades
Execute o projeto e o teste para um entendimento maior de como o projeto funciona (lembre da Mentalidade de Persistência)

<h2>Parte 2: implementando o que falta na classe Student e StudentService</h2>
Abra a classe Student (src/com/generation/model/Student.kt) e implemente os seguintes métodos:
  
fun enrollToCourse(course: Course?) {
    //TODO implement this method
}

fun isCourseApproved(courseCode: String?): Boolean {
    //TODO implement this method
    return false
}

fun isAttendingCourse(courseCode: String?): Boolean {
    //TODO implement this method
    return false
}

fun getApprovedCourses(): List<Course?>? {
    //TODO implement this method
    return null
}

Abra a classe StudentService (src/com/generation/service/StudentService.kt) e implemente os seguintes métodos:
  
fun isSubscribed(studentId: String?): Boolean {
    //TODO implement this method
    return false
}

fun showSummary() {
    //TODO implement
}
Dica: Para exibir o sumário (que nesse caso, serão os estudantes que já foram inscritos), use o println()

<h2>Parte 3: Implementando os métodos que faltam no Main</h2>
Teste o programa e verifica se funciona como o esperado:
Crie um novo estudante
Cadastra o estudante em alguns cursos.
Use a opção de Show Student Summary e Show Course Summary para verificar se está tudo ok

<h2>Parte 4: Lidando com Exceções</h2>
Registre um novo usuário, passando uma data incorreta.
Verifique o erro que acontece após rodar o programa
Acesse a classe PinterHelper e modifique o método createStudentMenu, para lidar com a exceção que ocorre quando o usuário insere uma data incorreta.
Mostre uma mensagem de erro para o usuário após conseguir lidar com a Exceção, além de atribuir uma data padrão para a variável birthDate, para não quebrar o programa.

<h2>Parte 5: Escrevendo Testes Unitários</h2>
Escreva ao menos 1 teste unitário para a classe StudentService
Escreva ao menos 1 teste unitário para a classe CourseService
