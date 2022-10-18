/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula09;

import java.util.List;

/**
 *
 * @author alex.lopes
 */
public abstract class ClienteRepository {

    public abstract List<Cliente> obter(Cliente cliente);

    public abstract Cliente obterPorId(int id);
}


