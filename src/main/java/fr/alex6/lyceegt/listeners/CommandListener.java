package fr.alex6.lyceegt.listeners;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.time.Instant;

import static fr.alex6.lyceegt.listeners.RoleListener.TR;

public class CommandListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        if (event.getMessage().getContentRaw().equals("!classes")) {
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setColor(Color.BLUE);
            embedBuilder.setTimestamp(Instant.now());
            embedBuilder.setTitle("Cochez votre classe");
            embedBuilder.setDescription(":one: 101\n:two: 102\n:three: 103\n:four: 104\n:five: 105\n:six: 106\n:seven: 107\n:eight: 108");
            event.getChannel().sendMessage(embedBuilder.build()).queue();
            event.getMessage().delete().queue();
        } else if (event.getMessage().getContentRaw().equals("!spés")) {
            event.getMessage().delete().queue();
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setColor(Color.CYAN);
            embedBuilder.setTimestamp(Instant.now());
            embedBuilder.setTitle("\uD83E\uDDEA Spé physique");
            embedBuilder.setDescription(":one: groupe 1\n:two: groupe 2\n:three: groupe 3\n:four: groupe 4\n:five: groupe 5\n:six: groupe 6");
            event.getChannel().sendMessage(embedBuilder.build()).queue();
            embedBuilder = new EmbedBuilder();
            embedBuilder.setColor(Color.GREEN);
            embedBuilder.setTimestamp(Instant.now());
            embedBuilder.setTitle("\uD83E\uDDEC Spé SVT");
            embedBuilder.setDescription(":one: groupe 1\n:two: groupe 2\n:three: groupe 3\n:four: groupe 4\n:five: groupe 5\n:six: groupe 6");
            event.getChannel().sendMessage(embedBuilder.build()).queue();
            embedBuilder = new EmbedBuilder();
            embedBuilder.setColor(Color.PINK);
            embedBuilder.setTimestamp(Instant.now());
            embedBuilder.setTitle("\uD83D\uDCCF Spé maths");
            embedBuilder.setDescription(":one: groupe 1\n:two: groupe 2\n:three: groupe 3\n:four: groupe 4\n:five: groupe 5\n:six: groupe 6");
            event.getChannel().sendMessage(embedBuilder.build()).queue();
            embedBuilder = new EmbedBuilder();
            embedBuilder.setColor(Color.MAGENTA);
            embedBuilder.setTimestamp(Instant.now());
            embedBuilder.setTitle("\uD83C\uDF0D Spé HGGSP");
            embedBuilder.setDescription(":one: groupe 1\n:two: groupe 2\n:three: groupe 3");
            event.getChannel().sendMessage(embedBuilder.build()).queue();
            embedBuilder = new EmbedBuilder();
            embedBuilder.setColor(Color.ORANGE);
            embedBuilder.setTimestamp(Instant.now());
            embedBuilder.setTitle("\uD83D\uDCB0 Spé SES");
            embedBuilder.setDescription(":one: groupe 1\n:two: groupe 2\n:three: groupe 3\n:four: groupe 4\n:five: groupe 5\n:six: groupe 6");
            event.getChannel().sendMessage(embedBuilder.build()).queue();
            embedBuilder = new EmbedBuilder();
            embedBuilder.setColor(Color.red);
            embedBuilder.setTimestamp(Instant.now());
            embedBuilder.setTitle("\uD83C\uDDEC\uD83C\uDDE7 Spé LLCE");
            embedBuilder.setDescription(":one: groupe 1\n:two: groupe 2\n:three: groupe 3\n:four: groupe 4\n:five: groupe 5\n:six: groupe 6");
            event.getChannel().sendMessage(embedBuilder.build()).queue();
            embedBuilder = new EmbedBuilder();
            embedBuilder.setColor(Color.WHITE);
            embedBuilder.setTimestamp(Instant.now());
            embedBuilder.setTitle("\uD83D\uDCD6 Spé Humanité");
            embedBuilder.setDescription(":one: groupe 1\n:two: groupe 2");
            event.getChannel().sendMessage(embedBuilder.build()).queue();
            embedBuilder = new EmbedBuilder();
            embedBuilder.setColor(Color.YELLOW);
            embedBuilder.setTimestamp(Instant.now());
            embedBuilder.setTitle("\uD83D\uDCD6 Spé SI");
            embedBuilder.setDescription(":zap: SI");
            event.getChannel().sendMessage(embedBuilder.build()).queue();
        } else if (event.getMessage().getContentRaw().startsWith("!copy ")) {
            String[] args = event.getMessage().getContentRaw().replace("!copy ", "").split(" ");
            Category category = event.getGuild().getCategoryById(args[0]);
            Category newCategory = event.getGuild().createCategory(category.getName().replace(args[1], args[2])).complete();
            for (GuildChannel channel : category.getChannels()) {
                channel.createCopy().complete().getManager().setName(channel.getName().replace(args[1], args[2])).setParent(newCategory).queue();
            }
            newCategory.getManager().setPosition(category.getPosition()+1).queue();
            event.getChannel().sendMessage("Terminé !").queue();
        } else if (event.getMessage().getContentRaw().startsWith("!react")) {
            event.getMessage().delete().queue();
            MessageHistory messageHistory = event.getChannel().getHistory();
            messageHistory.retrievePast(10).queue();
            for (Message message : messageHistory.getRetrievedHistory()) {
                for (MessageReaction reaction : message.getReactions()) {
                    message.addReaction(reaction.getReactionEmote().getAsReactionCode()).queue();
                }
            }
        } else if (event.getMessage().getContentRaw().equals("!langues")) {
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setColor(Color.BLUE);
            embedBuilder.setTimestamp(Instant.now());
            embedBuilder.setTitle("Cochez vos classes de langues");
            embedBuilder.setDescription(":flag_gb: **Anglais LV1**\n:one: Mme Touron\n:two: Mme Estour\n:three: Mr Barthelemy\n:four: Mr Bourin\n:five: Mme Gazel\n\n:flag_es: **Espagnol LV2:**\n:six: Mme Cherrouda\n:seven: Mme Devaux\n\n:flag_de: **Allemand LV2:** Mme Guenier\n\n:flag_it: **Italien LV2:** Mme Matter");
            Message message = event.getChannel().sendMessage(embedBuilder.build()).complete();
            event.getMessage().delete().queue();
            message.addReaction(TR[1]).queue();
            message.addReaction(TR[2]).queue();
            message.addReaction(TR[3]).queue();
            message.addReaction(TR[4]).queue();
            message.addReaction(TR[5]).queue();
            message.addReaction(TR[6]).queue();
            message.addReaction(TR[7]).queue();
            message.addReaction("\uD83C\uDDE9\uD83C\uDDEA").queue();
            message.addReaction("\uD83C\uDDEE\uD83C\uDDF9").queue();
        } else if (event.getMessage().getContentRaw().equals("!edit")) {
            Message message = event.getChannel().retrieveMessageById("828960086524690432").complete();
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setColor(Color.BLUE);
            embedBuilder.setTimestamp(Instant.now());
            embedBuilder.setTitle("Cochez vos classes de langues");
            embedBuilder.setDescription(":flag_gb: **Anglais LV1**\n:one: Mme Touron\n:two: Mme Estour\n:three: Mr Barthelemy\n:four: Mr Bourin\n:five: Mme Gazel\n\n:flag_es: **Espagnol LV2:**\n:six: Mme Cherrouda\n:seven: Mme Devaux\n\n:eight: **Allemand LV2:** Mme Guenier");
            message.editMessage(embedBuilder.build()).queue();
            event.getMessage().delete().queue();
            message.clearReactions().queue();
            message.addReaction(TR[1]).queue();
            message.addReaction(TR[2]).queue();
            message.addReaction(TR[3]).queue();
            message.addReaction(TR[4]).queue();
            message.addReaction(TR[5]).queue();
            message.addReaction(TR[6]).queue();
            message.addReaction(TR[7]).queue();
            message.addReaction(TR[8]).queue();
        } else if (event.getMessage().getContentRaw().equals("!it")) {
            EmbedBuilder embedBuilder = new EmbedBuilder();
            embedBuilder.setColor(Color.GREEN);
            embedBuilder.setTimestamp(Instant.now());
            embedBuilder.setTitle(":flag_it: Italien");
            embedBuilder.setDescription(":flag_it: Italien LV2: Mme Matter");
            Message message = event.getChannel().sendMessage(embedBuilder.build()).complete();
            message.addReaction("\uD83C\uDDEE\uD83C\uDDF9").queue();
        }
    }
}
