package works.alga.estudos.gerandoxml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;

public class LendoProduto {

	public static void main(String[] args) throws FileNotFoundException {
		XStream xstream = new XStream(new DomDriver());
		xstream.addPermission(AnyTypePermission.ANY); // linha necessaria para permitir leitura de arquivo
		xstream.alias("produto", Produto.class);
		xstream.aliasAttribute(Produto.class, "codigo", "codigo");

		Produto p = (Produto) xstream.fromXML(new FileInputStream("./produto2.xml"));
		/*
		 * produto p recebe a leitura de um produto de um arquivo xml no caminho
		 * especificado acima
		 */

		// mostrando o que foi lido e atribuido ao Produto p
		System.out.println(p.getCodigo());
		System.out.println(p.getDescricao());
		System.out.println(p.getValor());

	}

}
