#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

package ${package};

import lombok.extern.slf4j.Slf4j;
import nl.knaw.dans.lib.util.AbstractCommandLineApp;
import nl.knaw.dans.lib.util.CliVersionProvider;
import ${package}.config.${javaName}Config;
import picocli.AutoComplete.GenerateCompletion;
import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "${commandName}",
         mixinStandardHelpOptions = true,
         versionProvider = CliVersionProvider.class,
         description = "${description}")
@Slf4j
public class ${javaName} extends AbstractCommandLineApp<${javaName}Config> {
    public static void main(String[] args) throws Exception {
        new ${javaName}().run(args);
    }

    public String getName() {
        return "${description}";
    }

    @Override
    public void configureCommandLine(CommandLine commandLine, ${javaName}Config config) {
        // TODO: set up the API client, if applicable
        log.debug("Configuring command line");
        // TODO: add options and subcommands
    }
}
