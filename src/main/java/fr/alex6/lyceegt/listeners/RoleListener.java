package fr.alex6.lyceegt.listeners;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionAddEvent;
import net.dv8tion.jda.api.events.message.guild.react.GuildMessageReactionRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Objects;

public class RoleListener extends ListenerAdapter {
    public static final String[] TR = {"adadadadadad", "1️⃣", "2️⃣", "3️⃣", "4️⃣", "5️⃣", "6️⃣", "7️⃣", "8️⃣", "⚡", "\uD83C\uDDEE\uD83C\uDDF9"};
    private final String PHCH_TEMPLATE = "Ph-Ch g%s";
    private final String MATHS_TEMPLATE = "Maths g%s";
    private final String HGGSP_TEMPLATE = "HGGSP g%s";
    private final String SVT_TEMPLATE = "SVT g%s";
    private final String SES_TEMPLATE = "SES g%s";
    private final String LLCE_TEMPLATE = "LLCE g%s";
    private final String HUMANITE_TEMPLATE = "Humanité g%s";

    @Override
    public void onGuildMessageReactionAdd(@NotNull GuildMessageReactionAddEvent event) {
        if (!Arrays.asList(TR).contains(event.getReactionEmote().getAsReactionCode())) return;
        String target;
        Role role;
        switch (event.getMessageId()) {
            case "828908472484495371":
                target = String.format("10%s", Arrays.asList(TR).indexOf(event.getReactionEmote().getAsReactionCode()));
                role = event.getGuild().getRolesByName(target, true).get(0);
                event.getGuild().addRoleToMember(event.getMember(), role).queue();
                event.getGuild().modifyNickname(event.getMember(), String.format("[%s] %s", target, event.getMember().getEffectiveName())).queue();
                break;

            case "828919570461884456":
                target = String.format(PHCH_TEMPLATE, Arrays.asList(TR).indexOf(event.getReactionEmote().getAsReactionCode()));
                role = event.getGuild().getRolesByName(target, true).get(0);
                event.getGuild().addRoleToMember(event.getMember(), role).queue();
                break;
            case "828919571384893461":
                target = String.format(SVT_TEMPLATE, Arrays.asList(TR).indexOf(event.getReactionEmote().getAsReactionCode()));
                role = event.getGuild().getRolesByName(target, true).get(0);
                event.getGuild().addRoleToMember(event.getMember(), role).queue();
                break;
            case "828919572408303616":
                target = String.format(MATHS_TEMPLATE, Arrays.asList(TR).indexOf(event.getReactionEmote().getAsReactionCode()));
                role = event.getGuild().getRolesByName(target, true).get(0);
                event.getGuild().addRoleToMember(event.getMember(), role).queue();
                break;
            case "828919572945174569":
                target = String.format(HGGSP_TEMPLATE, Arrays.asList(TR).indexOf(event.getReactionEmote().getAsReactionCode()));
                role = event.getGuild().getRolesByName(target, true).get(0);
                event.getGuild().addRoleToMember(event.getMember(), role).queue();
                break;
            case "828919574065709076":
                target = String.format(SES_TEMPLATE, Arrays.asList(TR).indexOf(event.getReactionEmote().getAsReactionCode()));
                role = event.getGuild().getRolesByName(target, true).get(0);
                event.getGuild().addRoleToMember(event.getMember(), role).queue();
                break;
            case "828919592122318859":
                target = String.format(LLCE_TEMPLATE, Arrays.asList(TR).indexOf(event.getReactionEmote().getAsReactionCode()));
                role = event.getGuild().getRolesByName(target, true).get(0);
                event.getGuild().addRoleToMember(event.getMember(), role).queue();
                break;
            case "828919593665167400":
                target = String.format(HUMANITE_TEMPLATE, Arrays.asList(TR).indexOf(event.getReactionEmote().getAsReactionCode()));
                role = event.getGuild().getRolesByName(target, true).get(0);
                event.getGuild().addRoleToMember(event.getMember(), role).queue();
                break;
            case "828919594814144542":
                role = event.getGuild().getRoleById("827588632806031392");
                event.getGuild().addRoleToMember(event.getMember(), Objects.requireNonNull(role)).queue();
                break;
            case "828979721140043829":
                role = event.getGuild().getRoleById("828933781699166208");
                event.getGuild().addRoleToMember(event.getMember(), Objects.requireNonNull(role)).queue();
                break;

            case "828960086524690432":
                switch (event.getReactionEmote().getAsReactionCode()) {
                    case "1️⃣":
                        role = event.getGuild().getRoleById("828933056140279858");
                        event.getGuild().addRoleToMember(event.getMember(), Objects.requireNonNull(role)).queue();
                        break;
                    case "2️⃣":
                        role = event.getGuild().getRoleById("828933175161126923");
                        event.getGuild().addRoleToMember(event.getMember(), Objects.requireNonNull(role)).queue();
                        break;
                    case "3️⃣":
                        role = event.getGuild().getRoleById("828934761397485611");
                        event.getGuild().addRoleToMember(event.getMember(), Objects.requireNonNull(role)).queue();
                        break;
                    case "4️⃣":
                        role = event.getGuild().getRoleById("828934638269235210");
                        event.getGuild().addRoleToMember(event.getMember(), Objects.requireNonNull(role)).queue();
                        break;
                    case "5️⃣":
                        role = event.getGuild().getRoleById("828932854188081162");
                        event.getGuild().addRoleToMember(event.getMember(), Objects.requireNonNull(role)).queue();
                        break;
                    case "6️⃣":
                        role = event.getGuild().getRoleById("828933318358728766");
                        event.getGuild().addRoleToMember(event.getMember(), Objects.requireNonNull(role)).queue();
                        break;
                    case "7️⃣":
                        role = event.getGuild().getRoleById("828933510953697291");
                        event.getGuild().addRoleToMember(event.getMember(), Objects.requireNonNull(role)).queue();
                        break;
                    case "8️⃣":
                        role = event.getGuild().getRoleById("828933685452472350");
                        event.getGuild().addRoleToMember(event.getMember(), Objects.requireNonNull(role)).queue();
                        break;
                }
                break;
        }
    }

    @Override
    public void onGuildMessageReactionRemove(@NotNull GuildMessageReactionRemoveEvent event) {
        if (!Arrays.asList(TR).contains(event.getReactionEmote().getAsReactionCode())) return;
        Member member = event.retrieveMember().complete();
        String target;
        Role role;
        switch (event.getMessageId()) {
            case "828908472484495371":
                target = String.format("10%s", Arrays.asList(TR).indexOf(event.getReactionEmote().getAsReactionCode()));
                role = event.getGuild().getRolesByName(target, true).get(0);
                event.getGuild().removeRoleFromMember(member, role).queue();
                event.getGuild().modifyNickname(member, Objects.requireNonNull(member.getNickname()).substring(0, 4)).queue();
                break;

            case "828919570461884456":
                target = String.format(PHCH_TEMPLATE, Arrays.asList(TR).indexOf(event.getReactionEmote().getAsReactionCode()));
                role = event.getGuild().getRolesByName(target, true).get(0);
                event.getGuild().removeRoleFromMember(member, role).queue();
                break;
            case "828919571384893461":
                target = String.format(SVT_TEMPLATE, Arrays.asList(TR).indexOf(event.getReactionEmote().getAsReactionCode()));
                role = event.getGuild().getRolesByName(target, true).get(0);
                event.getGuild().removeRoleFromMember(member, role).queue();
                break;
            case "828919572408303616":
                target = String.format(MATHS_TEMPLATE, Arrays.asList(TR).indexOf(event.getReactionEmote().getAsReactionCode()));
                role = event.getGuild().getRolesByName(target, true).get(0);
                event.getGuild().removeRoleFromMember(member, role).queue();
                break;
            case "828919572945174569":
                target = String.format(HGGSP_TEMPLATE, Arrays.asList(TR).indexOf(event.getReactionEmote().getAsReactionCode()));
                role = event.getGuild().getRolesByName(target, true).get(0);
                event.getGuild().removeRoleFromMember(member, role).queue();
                break;
            case "828919574065709076":
                target = String.format(SES_TEMPLATE, Arrays.asList(TR).indexOf(event.getReactionEmote().getAsReactionCode()));
                role = event.getGuild().getRolesByName(target, true).get(0);
                event.getGuild().removeRoleFromMember(member, role).queue();
                break;
            case "828919592122318859":
                target = String.format(LLCE_TEMPLATE, Arrays.asList(TR).indexOf(event.getReactionEmote().getAsReactionCode()));
                role = event.getGuild().getRolesByName(target, true).get(0);
                event.getGuild().removeRoleFromMember(member, role).queue();
                break;
            case "828919593665167400":
                target = String.format(HUMANITE_TEMPLATE, Arrays.asList(TR).indexOf(event.getReactionEmote().getAsReactionCode()));
                role = event.getGuild().getRolesByName(target, true).get(0);
                event.getGuild().removeRoleFromMember(member, role).queue();
                break;
            case "828919594814144542":
                role = event.getGuild().getRoleById("827588632806031392");
                event.getGuild().removeRoleFromMember(member, Objects.requireNonNull(role)).queue();
                break;
            case "828979721140043829":
                role = event.getGuild().getRoleById("828933781699166208");
                event.getGuild().removeRoleFromMember(member, Objects.requireNonNull(role)).queue();
                break;

            case "828960086524690432":
                switch (event.getReactionEmote().getAsReactionCode()) {
                    case "1️⃣":
                        role = event.getGuild().getRoleById("828933056140279858");
                        event.getGuild().removeRoleFromMember(member, Objects.requireNonNull(role)).queue();
                        break;
                    case "2️⃣":
                        role = event.getGuild().getRoleById("828933175161126923");
                        event.getGuild().removeRoleFromMember(member, Objects.requireNonNull(role)).queue();
                        break;
                    case "3️⃣":
                        role = event.getGuild().getRoleById("828934761397485611");
                        event.getGuild().removeRoleFromMember(member, Objects.requireNonNull(role)).queue();
                        break;
                    case "4️⃣":
                        role = event.getGuild().getRoleById("828934638269235210");
                        event.getGuild().removeRoleFromMember(member, Objects.requireNonNull(role)).queue();
                        break;
                    case "5️⃣":
                        role = event.getGuild().getRoleById("828932854188081162");
                        event.getGuild().removeRoleFromMember(member, Objects.requireNonNull(role)).queue();
                        break;
                    case "6️⃣":
                        role = event.getGuild().getRoleById("828933318358728766");
                        event.getGuild().removeRoleFromMember(member, Objects.requireNonNull(role)).queue();
                        break;
                    case "7️⃣":
                        role = event.getGuild().getRoleById("828933510953697291");
                        event.getGuild().removeRoleFromMember(member, Objects.requireNonNull(role)).queue();
                        break;
                    case "8️⃣":
                        role = event.getGuild().getRoleById("828933685452472350");
                        event.getGuild().removeRoleFromMember(member, Objects.requireNonNull(role)).queue();
                        break;
                }
                break;
        }
    }
}
